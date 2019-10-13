package com.hsys.tea.milktea.user.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.ShoppingbagdetailInfoMapper;
import com.hsys.tea.milktea.dao.ShoppingbagMapper;
import com.hsys.tea.milktea.entity.Shoppingbag;
import com.hsys.tea.milktea.entity.ShoppingbagdetailInfo;
import com.hsys.tea.milktea.user.service.IShoppingBagService;
import com.hsys.tea.milktea.utils.SequenceNumberUtils;

@Service
public class ShoppingBagService implements IShoppingBagService{
	
	@Autowired
	private ShoppingbagMapper sm;
	
	@Autowired
	private ShoppingbagdetailInfoMapper sbdm;
	
	@Override
	public String findCurrentUserBag(Shoppingbag shoppingbag) {
		return JSONArray.toJSONString(sm.findCurrentUserBag(shoppingbag));
	}
	
	@Override
	@Transactional
	public String saveCurrentUserBag(Shoppingbag shoppingbag) {
		//判断是否为更新
		if(shoppingbag.getBagId() != null) {
			if(shoppingbag.getCommodityQantity() <= 0) {
				int responsedelbag = sm.deleteByPrimaryKey(shoppingbag.getBagId());
				if(responsedelbag <= 0) {
					return ConfigConstant.renewalfaling;
				}
				int responsedelDetailBag = sbdm.deleteByBagId(shoppingbag.getBagId());
				if(responsedelDetailBag > 0) {
					return ConfigConstant.renewalwin;
				}
			}
			int reponseupdatebag = sm.updateByPrimaryKey(shoppingbag);
			if(reponseupdatebag > 0) {
				return ConfigConstant.renewalwin;
			}
		}
		//不是更新则查看库存里面的东西是否和新订购的东西相同如果相同则更新
		List<ShoppingbagdetailInfo> shoppingbagDetailInfos = shoppingbag.getShoppingbagDetailInfos();
		List<Shoppingbag> findUserBags = sm.findCurrentUserBag(shoppingbag);
		Shoppingbag temp = null;
		for(Shoppingbag bag : findUserBags) {
			boolean flag = true;
			if(shoppingbag.getScommodityId() == bag.getScommodityId()) {
				for(ShoppingbagdetailInfo info : shoppingbagDetailInfos) {
					boolean flagb = false;
					for(ShoppingbagdetailInfo srcInfo : bag.getShoppingbagDetailInfos()) {
						if(info.getMaterialId() == srcInfo.getMaterialId()) {
							flagb = true;
							break;
						}
					}
					if(!flagb) {
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				temp = bag;
				break;
			}
		}
		if(temp != null) {
			temp.setCommodityQantity(temp.getCommodityQantity()+shoppingbag.getCommodityQantity());
			int responseupdate = sm.updateByPrimaryKey(temp);
			if(responseupdate > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		//插入一个新的购物车信息和购物车详情的信息
		shoppingbag.setBagId(new Long(SequenceNumberUtils.getInstance().getCatCode(new Long(shoppingbag.getUserId()))));
		shoppingbag.setCreateTime(new Date());
		int responsebag = sm.insert(shoppingbag);
		System.out.println(shoppingbag.getBagId());
		if(responsebag>0) {
			int addValue = 0;
			for(ShoppingbagdetailInfo sd : shoppingbag.getShoppingbagDetailInfos()) {
				addValue++;
				sd.setBagDetailId(shoppingbag.getBagId()+addValue);
				sd.setBagId(shoppingbag.getBagId());
				sd.setCreateTime(new Date());
			}
		}else {
			return ConfigConstant.renewalfaling;
		}
		int batchResponse = sbdm.insertByBatch(shoppingbag.getShoppingbagDetailInfos());
		if(batchResponse > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

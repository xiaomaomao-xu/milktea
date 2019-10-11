package com.hsys.tea.milktea.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.ShoppingbagDetailInfoMapper;
import com.hsys.tea.milktea.dao.ShoppingbagMapper;
import com.hsys.tea.milktea.entity.Shoppingbag;
import com.hsys.tea.milktea.entity.ShoppingbagDetailInfo;
import com.hsys.tea.milktea.utils.SequenceNumberUtils;

@Service
public class ShoppingBagService {
	
	@Autowired
	private ShoppingbagMapper sm;
	
	@Autowired
	private ShoppingbagDetailInfoMapper sbdm;
	
	public String findCurrentUserBag(Shoppingbag shoppingbag) {
		return JSONObject.toJSONString(sm.findCurrentUserBag(shoppingbag));
	}
	
	@Transactional
	public String addCurrentUserBag(Shoppingbag shoppingbag) {
		shoppingbag.setBagId(new Long(SequenceNumberUtils.getInstance().getCatCode(new Long(shoppingbag.getUserId()))));
		int responsebag = sm.insert(shoppingbag);
		System.out.println(shoppingbag.getBagId());
		if(responsebag>0) {
			int addValue = 0;
			for(ShoppingbagDetailInfo sd : shoppingbag.getShoppingbagDetailInfos()) {
				addValue++;
				sd.setBagDetailId(shoppingbag.getBagId()+addValue);
				sd.setBagId(shoppingbag.getBagId());
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
	
	@Transactional
	public String updateCurrentUserBag(Shoppingbag shoppingbag) {
		int updateBag= sm.updateByPrimaryKeySelective(shoppingbag);
		if(updateBag > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

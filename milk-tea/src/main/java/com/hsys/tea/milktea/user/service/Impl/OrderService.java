package com.hsys.tea.milktea.user.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.CommoditymaterialMapper;
import com.hsys.tea.milktea.dao.OrderdetailinfoMapper;
import com.hsys.tea.milktea.dao.OrderinfoMapper;
import com.hsys.tea.milktea.dao.ShoppingbagdetailInfoMapper;
import com.hsys.tea.milktea.dao.ShoppingbagMapper;
import com.hsys.tea.milktea.entity.Commoditymaterial;
import com.hsys.tea.milktea.entity.Orderdetailinfo;
import com.hsys.tea.milktea.entity.Orderinfo;
import com.hsys.tea.milktea.entity.Shoppingbag;
import com.hsys.tea.milktea.entity.ShoppingbagdetailInfo;
import com.hsys.tea.milktea.user.service.IOrderService;
@Service
public class OrderService implements IOrderService{
	@Autowired
	private OrderinfoMapper om;
	
	@Autowired
	private OrderdetailinfoMapper odm;
	
	@Autowired
	private ShoppingbagMapper sm;
	
	@Autowired
	private ShoppingbagdetailInfoMapper sdm;
	
	private CommoditymaterialMapper cm;
	
	@Override
	@Transactional
	public String insertCurrentUserOrder(Orderinfo orderinfo) {
		//插入订单表和订单详情表
		orderinfo.setCreateTime(new Date());
		int responseOrder = om.insert(orderinfo);
		System.out.println(orderinfo.getOrderId());
		if(responseOrder > 0) {
			int addValue = 0;
			for(Orderdetailinfo odl : orderinfo.getOrderdetailinfos()) {
				addValue++;
				odl.setOrderDetailId((orderinfo.getOrderId()+addValue));
				odl.setOrderId(orderinfo.getOrderId());
				odl.setCreateTime(new Date());
				odl.setOrderTime(new Date());
			}
		}else {
			return ConfigConstant.renewalfaling;
		}
		int batchResponse = odm.insertByBatch(orderinfo.getOrderdetailinfos());
		if(batchResponse <= 0) {
			return ConfigConstant.renewalfaling;
		}
		//删除购物车以及购物车详情
		Shoppingbag shoppingbag = new Shoppingbag();
		shoppingbag.setUserId(orderinfo.getUserId());
		List<Shoppingbag> findCurrentUserBag = sm.findCurrentUserBag(shoppingbag);
		Map<Integer, Integer> productIds = new HashMap<Integer,Integer>();
		for(Shoppingbag sb : findCurrentUserBag){
			List<ShoppingbagdetailInfo> sds = sb.getShoppingbagDetailInfos();
			for(ShoppingbagdetailInfo sd : sds) {
				if(productIds.containsKey(sd.getMaterialId())) {
					productIds.put(sd.getMaterialId(),productIds.get(sd.getMaterialId())+sb.getCommodityQantity());
				}else {
					productIds.put(sd.getMaterialId(),sb.getCommodityQantity());
				}
			}
			int responseBag = sm.deleteByPrimaryKey(sb.getBagId());
			if(responseBag <= 0) {
				return ConfigConstant.renewalfaling;
			}
			int responseBatchBag = sdm.deleteByBagId(sb.getBagId());
			if(responseBatchBag <= 0 ) {
				return ConfigConstant.renewalfaling;
			}
		}
		//更新库存信息
		int updateproduct = updateproduct(productIds);
		if(updateproduct > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	/**
	 * 修改产品数量
	 * @param productIds
	 */
	private int updateproduct(Map<Integer, Integer> productIds) {
		List<Commoditymaterial> products = new ArrayList<Commoditymaterial>();
		Set<Entry<Integer, Integer>> entrySet = productIds.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Integer> next = iterator.next();
			Commoditymaterial temp = new Commoditymaterial();
			temp.setMaterialId(next.getKey());
			temp.setMaterialQuantity(next.getValue());
			products.add(temp);
		}
		return cm.updateByBatch(products);
	}
	
	@Override
	@Transactional
	public String updateOrder(Orderinfo orderinfo) {
		int response = om.updateByPrimaryKey(orderinfo);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
		
	}
	
	@Override
	public String getOrderinfo(Orderinfo orderinfo) {
		return JSONArray.toJSONString(om.selectOrderinfo(orderinfo));
	}
	
	@Override
	public String getDetailOrderinfo(Orderinfo orderinfo) {
		return JSONObject.toJSONString(om.selectDeatilOrderinfo(orderinfo));
	}
	
	
}

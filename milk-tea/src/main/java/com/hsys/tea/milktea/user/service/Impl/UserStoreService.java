package com.hsys.tea.milktea.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.dao.CommodityinfoMapper;
import com.hsys.tea.milktea.dao.StoreinfoMapper;
import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.Storeinfo;

@Service
public class UserStoreService {
	
	@Autowired
	private StoreinfoMapper sm;
	
	@Autowired
	private CommodityinfoMapper cm;
	
	public String getDetailStoreinfo(Storeinfo store) {
		Storeinfo detailStoreinfo = sm.getDetailStoreinfo(store);
		//设置用户到店铺的距离
		detailStoreinfo.setDistance(store.getDistance());
		return JSONObject.toJSONString(detailStoreinfo);
	}
	
	public String getDetailCommodityinfo(Commodityinfo commodityinfo) {
		
		return JSONObject.toJSONString(cm.getDetailCommodityinfo(commodityinfo));
	}
}
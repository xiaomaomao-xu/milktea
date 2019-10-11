package com.hsys.tea.milktea.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.StoreinfoMapper;
import com.hsys.tea.milktea.entity.Storeinfo;

@Service
public class StoreService {
	@Autowired
	private StoreinfoMapper sm;
	
	public String getAllStore() {
		return JSONArray.toJSONString(sm.findAllList());
	}
	
	public String getStore(Storeinfo store) {
		return JSONObject.toJSONString(sm.selectByPrimaryKey(store.getStoreId()));
	}
	
	public String saveStore(Storeinfo store) {
		if(store.getStoreId() != null) {
			System.out.println("storeid"+store.getStoreId());
			int response = sm.updateByPrimaryKey(store);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		int response = sm.insert(store);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	public String deleteStore(Storeinfo store) {
		int response = sm.deleteByPrimaryKey(store.getStoreId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

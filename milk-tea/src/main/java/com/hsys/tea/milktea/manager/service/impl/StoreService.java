package com.hsys.tea.milktea.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.StoreinfoMapper;
import com.hsys.tea.milktea.entity.Storeinfo;
import com.hsys.tea.milktea.manager.service.IStoreService;

@Service
public class StoreService implements IStoreService{
	@Autowired
	private StoreinfoMapper sm;
	
	@Override
	public String getAllStore() {
		return JSONArray.toJSONString(sm.findAllList());
	}
	
	@Override
	public String getStore(Storeinfo store) {
		return JSONObject.toJSONString(sm.selectByPrimaryKey(store.getStoreId()));
	}
	
	@Override
	@Transactional
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
	
	@Override
	@Transactional
	public String deleteStore(Storeinfo store) {
		int response = sm.deleteByPrimaryKey(store.getStoreId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

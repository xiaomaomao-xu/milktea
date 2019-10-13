package com.hsys.tea.milktea.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.ShopkeeperinfoMapper;
import com.hsys.tea.milktea.entity.Shopkeeperinfo;
import com.hsys.tea.milktea.manager.service.IStoreOwnerService;

@Service
public class StoreOwnerService implements IStoreOwnerService{
	@Autowired
	private ShopkeeperinfoMapper sm;
	
	@Override
	public String getStoreOwnerInfo(Shopkeeperinfo ownerInfo) {
		return JSONArray.toJSONString(sm.selectByStoreId(ownerInfo.getStoreId()));
	}
	
	@Override
	@Transactional
	public String savaStoreOwnerInfo(Shopkeeperinfo ownerInfo) {
		if(ownerInfo.getShopkeeperId() != null) {
			int response = sm.updateByPrimaryKey(ownerInfo);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		int response = sm.insert(ownerInfo);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	@Override
	@Transactional
	public String deleteStoreOwnerInfo(Shopkeeperinfo ownerInfo) {
		int response = sm.deleteByPrimaryKey(ownerInfo.getShopkeeperId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

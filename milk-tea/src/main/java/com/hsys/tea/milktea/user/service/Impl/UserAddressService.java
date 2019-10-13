package com.hsys.tea.milktea.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.ShippingaddressinfoMapper;
import com.hsys.tea.milktea.entity.Shippingaddressinfo;
import com.hsys.tea.milktea.user.service.IUserAddressService;

@Service
public class UserAddressService implements IUserAddressService{
	
	@Autowired
	private ShippingaddressinfoMapper sm;
	
	@Override
	public String getUserAllAddress(Shippingaddressinfo address) {
		return JSONArray.toJSONString(sm.findAllList(address.getUserId()));
	}
	
	@Override
	public String getUserAddress(Shippingaddressinfo address) {
		return JSONObject.toJSONString(sm.selectByPrimaryKey(address.getAddressId()));
	}
	
	@Override
	@Transactional
	public String savaUserAddress(Shippingaddressinfo address) {
		if(address.getAddressId() !=null) {
			int response = sm.updateByPrimaryKey(address);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		int response = sm.insert(address);
		if(response > 0 ) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	@Override
	@Transactional
	public String deleteUserAddress(Shippingaddressinfo address) {
		int response = sm.deleteByPrimaryKey(address.getAddressId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

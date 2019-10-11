package com.hsys.tea.milktea.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.ShippingaddressinfoMapper;
import com.hsys.tea.milktea.entity.Shippingaddressinfo;

@Service
public class UserAddressService {
	
	@Autowired
	private ShippingaddressinfoMapper sm;
	
	public String getUserAllAddress(Shippingaddressinfo address) {
		return JSONArray.toJSONString(sm.findAllList(address.getUserId()));
	}
	
	public String getUserAddress(Shippingaddressinfo address) {
		return JSONObject.toJSONString(sm.selectByPrimaryKey(address.getAddressId()));
	}
	
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
	
	public String deleteUserAddress(Shippingaddressinfo address) {
		int response = sm.deleteByPrimaryKey(address.getAddressId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

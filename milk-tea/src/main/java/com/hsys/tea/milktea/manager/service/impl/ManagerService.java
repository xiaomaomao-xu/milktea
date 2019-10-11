package com.hsys.tea.milktea.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.UserinfoMapper;
import com.hsys.tea.milktea.entity.Userinfo;

@Service
public class ManagerService {
	@Autowired
	private UserinfoMapper um;
	
	public String getAllManager() {
		return JSONArray.toJSONString(um.findAllList());
	}
	
	public String getManager(Userinfo manager) {
		return JSONObject.toJSONString(um.selectByPrimaryKey(manager.getUserId()));
	}
	
	public String savaManager(Userinfo manager) {
		if(manager.getUserId() != null) {
			int response = um.updateByPrimaryKey(manager);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		int response = um.insert(manager);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
		
	}
	
	public String deleteManager(Userinfo manager) {
		int response = um.deleteByPrimaryKey(manager.getUserId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

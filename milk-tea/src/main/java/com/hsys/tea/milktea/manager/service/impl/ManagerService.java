package com.hsys.tea.milktea.manager.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.UserinfoMapper;
import com.hsys.tea.milktea.entity.Userinfo;
import com.hsys.tea.milktea.manager.service.IManagerService;
import com.hsys.tea.milktea.utils.Md5Utils;

@Service
public class ManagerService implements IManagerService{
	@Autowired
	private UserinfoMapper um;
	
	@Override
	public String getAllManager() {
		return JSONArray.toJSONString(um.findAllList());
	}
	
	@Override
	public String getManager(Userinfo manager) {
		return JSONObject.toJSONString(um.selectByPrimaryKey(manager.getUserId()));
	}
	
	@Override
	@Transactional
	public String savaManager(Userinfo manager) {
		if(manager.getUserId() != null) {
			manager.setModifyTime(new Date());
			int response = um.updateByPrimaryKey(manager);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		manager.setCreateTime(new Date());
		manager.setModifyTime(new Date());
		String str = UUID.randomUUID()+"";
	    str=str.replace("-", "");
	    System.out.println("之前的密码"+str);
	    System.out.println("加上uuid的密码"+manager.getUserPassword()+str);
		manager.setSalt(str);
		String md5 = Md5Utils.getInstance().md5(manager.getUserPassword()+str);
		manager.setUserPassword(md5);
		int response = um.insert(manager);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
		
	}
	
	
	/**
	 * 管理员这个我觉得可以直接删除
	 * 如果不行就变为逻辑删除
	 */
	@Override
	@Transactional
	public String deleteManager(Userinfo manager) {
		int response = um.deleteByPrimaryKey(manager.getUserId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

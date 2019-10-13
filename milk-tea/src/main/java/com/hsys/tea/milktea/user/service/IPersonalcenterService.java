package com.hsys.tea.milktea.user.service;

import com.hsys.tea.milktea.entity.Userinfo;

public interface IPersonalcenterService {
	
	//登录
	public Userinfo login(Userinfo us);
	
	//查询用户 
	public Userinfo querusr(Userinfo us);
	
	//修改用户
	public String upuser(Userinfo us);

}

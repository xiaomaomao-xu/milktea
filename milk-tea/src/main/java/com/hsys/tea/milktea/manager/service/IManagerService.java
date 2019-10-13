package com.hsys.tea.milktea.manager.service;

import com.hsys.tea.milktea.entity.Userinfo;

public interface IManagerService {
	/**
	 * 获取所有的管理信息
	 * @return
	 */
	String getAllManager();
	
	/**
	 * 获取管理员的信息
	 * @param manager
	 * @return
	 */
	String getManager(Userinfo manager);
	
	/**
	 * 保存管理员的信息
	 * @param manager
	 * @return
	 */
	String savaManager(Userinfo manager);
	
	/**
	 * 删除管理员的信息
	 * @param manager
	 * @return
	 */
	String deleteManager(Userinfo manager);
}

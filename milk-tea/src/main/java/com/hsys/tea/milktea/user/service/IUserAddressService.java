package com.hsys.tea.milktea.user.service;

import com.hsys.tea.milktea.entity.Shippingaddressinfo;

public interface IUserAddressService {
	
	/**
	 * 获取用户的所有的地址
	 * @param address
	 * @return
	 */
	String getUserAllAddress(Shippingaddressinfo address);
	
	/**
	 * 获取当前用户编辑的地址信息
	 * @param address
	 * @return
	 */
	String getUserAddress(Shippingaddressinfo address);
	
	/**
	 * 保存用户编辑的地址信息
	 * @param address
	 * @return
	 */
	String savaUserAddress(Shippingaddressinfo address);
	
	/**
	 * 删除用户的地址信息
	 * @param address
	 * @return
	 */
	String deleteUserAddress(Shippingaddressinfo address);

}

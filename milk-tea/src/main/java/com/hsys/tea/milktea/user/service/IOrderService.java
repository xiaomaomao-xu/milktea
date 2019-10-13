package com.hsys.tea.milktea.user.service;

import com.hsys.tea.milktea.entity.Orderinfo;

public interface IOrderService {
	
	/**
	 * 插入当前的用户订单
	 * @param orderinfo
	 * @return
	 */
	String insertCurrentUserOrder(Orderinfo orderinfo);
	
	/**
	 * 获取当前的用户订单
	 * @param orderinfo
	 * @return
	 */
	String getOrderinfo(Orderinfo orderinfo);
	
	/**
	 * 获取详细的订单信息
	 * @param orderinfo
	 * @return
	 */
	String getDetailOrderinfo(Orderinfo orderinfo);

	/**
	 * 用来修改订单的一些信息
	 * @param orderinfo
	 * @return
	 */
	String updateOrder(Orderinfo orderinfo);
}

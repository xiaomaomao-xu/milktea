package com.hsys.tea.milktea.manager.service;

import com.hsys.tea.milktea.entity.Commoditytype;

public interface IProdOfferTypeService {
	
	/**
	 * 获取所有的商品类型
	 * @param type
	 * @return
	 */
	String getAllOfferType(Commoditytype type);
	
	/**
	 * 获取所有的产品类型
	 * @param type
	 * @return
	 */
	String gerALLprodType(Commoditytype type);
	
	/**
	 * 获取类型
	 * @param type
	 * @return
	 */
	String getType(Commoditytype type);
	
	/**
	 * 保存类型
	 * @param type
	 * @return
	 */
	String savaType(Commoditytype type);
	
	/**
	 * 删除类型
	 * @param type
	 * @return
	 */
	String deleteType(Commoditytype type);
}

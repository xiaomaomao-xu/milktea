package com.hsys.tea.milktea.manager.service;

import com.hsys.tea.milktea.entity.Commoditymaterial;

public interface IProductService {
	
	/**
	 * 通过产品类型编号获取该类型所有的产品
	 * @param material
	 * @return
	 */
	String getAllProduct(Commoditymaterial material);
	
	/**
	 * 通过超编号获取产品信息
	 * @param material
	 * @return
	 */
	String getProduct(Commoditymaterial material);
	
	/**
	 * 保存产品信息
	 * @param material
	 * @return
	 */
	String saveProduct(Commoditymaterial material);
	
	/**
	 * 删除产品
	 * @param material
	 * @return
	 */
	String deleteProduct(Commoditymaterial material);
}

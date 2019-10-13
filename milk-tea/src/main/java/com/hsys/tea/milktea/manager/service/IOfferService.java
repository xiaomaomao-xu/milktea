package com.hsys.tea.milktea.manager.service;

import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.InfProductOfferingRel;

public interface IOfferService {
	/**
	 * 通过商品类型编号
	 * 获取所有的商品
	 * @param offer
	 * @return
	 */
	String getAllOffer(Commodityinfo offer);
	
	/**
	 * 获取当前的商品信息
	 * @param offer
	 * @return
	 */
	String getOffer(Commodityinfo offer);
	
	/**
	 * 保存商品信息
	 * @param offer
	 * @return
	 */
	String savaOffer(Commodityinfo offer);
	
	/**
	 * 删除商品
	 * 这个一般不需要
	 * @param offer
	 * @return
	 */
	String deleteOffer(Commodityinfo offer);
	
	/**
	 * 添加商品和产品的依赖关系
	 * @param rel
	 * @return
	 */
	String addProdOfferRel(InfProductOfferingRel rel);
	
	/**
	 * 删除商品和产品的依赖关系
	 * @param rel
	 * @return
	 */
	String deleteProdOfferRel(InfProductOfferingRel rel);
	
	/**
	 * 添加产品之间的互斥关系
	 * @param rel
	 * @return
	 */
	String addOfferExclusion(InfProductOfferingRel rel);
	
	/**
	 * 取消产品之间的互斥关系
	 * @param rel
	 * @return
	 */
	String cancelOfferExclusion(InfProductOfferingRel rel);
}

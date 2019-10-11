package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.Commoditytype;

public interface CommoditytypeMapper {
	/**
	 * 获取所有商品的类型
	 * @param storeId 
	 * @return
	 */
	List<Commoditytype> findAllOfferList(Integer storeId);
	
	/**
	 * 获取所有产品的类型
	 * @param storeId 
	 * @return
	 */
	List<Commoditytype> findAllPordList(Integer storeId);
	
    int deleteByPrimaryKey(Integer materialTypeId);

    int insert(Commoditytype record);

    int insertSelective(Commoditytype record);

    Commoditytype selectByPrimaryKey(Integer materialTypeId);

    int updateByPrimaryKeySelective(Commoditytype record);

    int updateByPrimaryKey(Commoditytype record);
}
package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.Shippingaddressinfo;

public interface ShippingaddressinfoMapper {
	List<Shippingaddressinfo> findAllList(Integer userId);
	
    int deleteByPrimaryKey(Integer addressId);

    int insert(Shippingaddressinfo record);

    int insertSelective(Shippingaddressinfo record);

    Shippingaddressinfo selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(Shippingaddressinfo record);

    int updateByPrimaryKey(Shippingaddressinfo record);
}
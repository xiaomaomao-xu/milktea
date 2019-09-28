package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Shippingaddressinfo;

public interface ShippingaddressinfoMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(Shippingaddressinfo record);

    int insertSelective(Shippingaddressinfo record);

    Shippingaddressinfo selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(Shippingaddressinfo record);

    int updateByPrimaryKey(Shippingaddressinfo record);
}
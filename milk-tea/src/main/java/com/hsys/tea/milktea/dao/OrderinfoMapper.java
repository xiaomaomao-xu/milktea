package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Orderinfo;

public interface OrderinfoMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Orderinfo record);

    int insertSelective(Orderinfo record);

    Orderinfo selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Orderinfo record);

    int updateByPrimaryKey(Orderinfo record);
}
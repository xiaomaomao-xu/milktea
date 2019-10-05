package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Orderdetailinfo;

public interface OrderdetailinfoMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(Orderdetailinfo record);

    int insertSelective(Orderdetailinfo record);

    Orderdetailinfo selectByPrimaryKey(Integer orderDetailId);

    int updateByPrimaryKeySelective(Orderdetailinfo record);

    int updateByPrimaryKey(Orderdetailinfo record);
}
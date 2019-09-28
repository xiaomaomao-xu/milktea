package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Orderdetailinfo;

public interface OrderdetailinfoMapper {
    int deleteByPrimaryKey(Long orderDetailId);

    int insert(Orderdetailinfo record);

    int insertSelective(Orderdetailinfo record);

    Orderdetailinfo selectByPrimaryKey(Long orderDetailId);

    int updateByPrimaryKeySelective(Orderdetailinfo record);

    int updateByPrimaryKey(Orderdetailinfo record);
}
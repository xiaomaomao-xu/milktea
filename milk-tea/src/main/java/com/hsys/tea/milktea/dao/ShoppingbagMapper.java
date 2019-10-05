package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Shoppingbag;

public interface ShoppingbagMapper {
    int deleteByPrimaryKey(Integer bagId);

    int insert(Shoppingbag record);

    int insertSelective(Shoppingbag record);

    Shoppingbag selectByPrimaryKey(Integer bagId);

    int updateByPrimaryKeySelective(Shoppingbag record);

    int updateByPrimaryKey(Shoppingbag record);
}
package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Shoppingbag;

public interface ShoppingbagMapper {
	Shoppingbag findCurrentUserBag(Shoppingbag record);
	
    int deleteByPrimaryKey(Long bagId);

    int insert(Shoppingbag record);

    int insertSelective(Shoppingbag record);

    Shoppingbag selectByPrimaryKey(Long bagId);

    int updateByPrimaryKeySelective(Shoppingbag record);

    int updateByPrimaryKey(Shoppingbag record);
}
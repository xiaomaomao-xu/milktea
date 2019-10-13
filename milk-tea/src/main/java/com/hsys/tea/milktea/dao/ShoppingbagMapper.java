package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.Shoppingbag;

public interface ShoppingbagMapper {
	List<Shoppingbag> findUserDetailBag(Shoppingbag record);
	
	List<Shoppingbag> findCurrentUserBag(Shoppingbag record);
	
    int deleteByPrimaryKey(Long bagId);

    int insert(Shoppingbag record);

    int insertSelective(Shoppingbag record);

    Shoppingbag selectByPrimaryKey(Long bagId);

    int updateByPrimaryKeySelective(Shoppingbag record);

    int updateByPrimaryKey(Shoppingbag record);
}
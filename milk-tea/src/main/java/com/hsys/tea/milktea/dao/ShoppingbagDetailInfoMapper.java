package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.ShoppingbagDetailInfo;

public interface ShoppingbagDetailInfoMapper {
	int insertByBatch(List<ShoppingbagDetailInfo> shoppingbagDetailInfos);
	
    int deleteByPrimaryKey(Long bagDetailId);

    int insert(ShoppingbagDetailInfo record);

    int insertSelective(ShoppingbagDetailInfo record);

    ShoppingbagDetailInfo selectByPrimaryKey(Long bagDetailId);

    int updateByPrimaryKeySelective(ShoppingbagDetailInfo record);

    int updateByPrimaryKey(ShoppingbagDetailInfo record);
}
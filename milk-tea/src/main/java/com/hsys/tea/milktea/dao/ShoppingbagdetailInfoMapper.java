package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.ShoppingbagdetailInfo;

public interface ShoppingbagdetailInfoMapper {
	int insertByBatch(List<ShoppingbagdetailInfo> shoppingbagDetailInfos);
	
	int deleteByBagId(Long bagId);
	
    int deleteByPrimaryKey(Long bagDetailId);

    int insert(ShoppingbagdetailInfo record);

    int insertSelective(ShoppingbagdetailInfo record);

    ShoppingbagdetailInfo selectByPrimaryKey(Long bagDetailId);

    int updateByPrimaryKeySelective(ShoppingbagdetailInfo record);

    int updateByPrimaryKey(ShoppingbagdetailInfo record);
}
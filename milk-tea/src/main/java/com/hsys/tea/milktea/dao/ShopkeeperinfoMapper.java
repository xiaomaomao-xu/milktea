package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Shopkeeperinfo;

public interface ShopkeeperinfoMapper {
    int deleteByPrimaryKey(Integer shopkeeperId);

    int insert(Shopkeeperinfo record);

    int insertSelective(Shopkeeperinfo record);

    Shopkeeperinfo selectByPrimaryKey(Integer shopkeeperId);

    int updateByPrimaryKeySelective(Shopkeeperinfo record);

    int updateByPrimaryKey(Shopkeeperinfo record);
}
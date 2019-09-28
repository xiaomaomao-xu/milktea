package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Commodityinfo;

public interface CommodityinfoMapper {
    int deleteByPrimaryKey(Integer commodityId);

    int insert(Commodityinfo record);

    int insertSelective(Commodityinfo record);

    Commodityinfo selectByPrimaryKey(Integer commodityId);

    int updateByPrimaryKeySelective(Commodityinfo record);

    int updateByPrimaryKey(Commodityinfo record);
}
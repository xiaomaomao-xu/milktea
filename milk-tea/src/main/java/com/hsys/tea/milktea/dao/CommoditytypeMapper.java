package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Commoditytype;

public interface CommoditytypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(Commoditytype record);

    int insertSelective(Commoditytype record);

    Commoditytype selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Commoditytype record);

    int updateByPrimaryKey(Commoditytype record);
}
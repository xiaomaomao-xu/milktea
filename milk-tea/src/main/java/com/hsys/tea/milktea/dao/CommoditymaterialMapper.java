package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Commoditymaterial;

public interface CommoditymaterialMapper {
    int deleteByPrimaryKey(Integer materialId);

    int insert(Commoditymaterial record);

    int insertSelective(Commoditymaterial record);

    Commoditymaterial selectByPrimaryKey(Integer materialId);

    int updateByPrimaryKeySelective(Commoditymaterial record);

    int updateByPrimaryKey(Commoditymaterial record);
}
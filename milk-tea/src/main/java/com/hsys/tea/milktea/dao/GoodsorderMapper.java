package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Goodsorder;

public interface GoodsorderMapper {
    int deleteByPrimaryKey(Integer ordercommodityId);

    int insert(Goodsorder record);

    int insertSelective(Goodsorder record);

    Goodsorder selectByPrimaryKey(Integer ordercommodityId);

    int updateByPrimaryKeySelective(Goodsorder record);

    int updateByPrimaryKey(Goodsorder record);
}
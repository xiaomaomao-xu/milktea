package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Exchangeitem;

public interface ExchangeitemMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(Exchangeitem record);

    int insertSelective(Exchangeitem record);

    Exchangeitem selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(Exchangeitem record);

    int updateByPrimaryKey(Exchangeitem record);
}
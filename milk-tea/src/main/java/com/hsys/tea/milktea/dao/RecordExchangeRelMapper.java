package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.RecordExchangeRel;

public interface RecordExchangeRelMapper {
    int deleteByPrimaryKey(Integer relId);

    int insert(RecordExchangeRel record);

    int insertSelective(RecordExchangeRel record);

    RecordExchangeRel selectByPrimaryKey(Integer relId);

    int updateByPrimaryKeySelective(RecordExchangeRel record);

    int updateByPrimaryKey(RecordExchangeRel record);
}
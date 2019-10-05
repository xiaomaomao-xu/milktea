package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Integralrecord;

public interface IntegralrecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(Integralrecord record);

    int insertSelective(Integralrecord record);

    Integralrecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(Integralrecord record);

    int updateByPrimaryKey(Integralrecord record);
}
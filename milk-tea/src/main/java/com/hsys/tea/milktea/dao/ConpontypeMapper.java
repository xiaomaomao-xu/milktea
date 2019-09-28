package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Conpontype;

public interface ConpontypeMapper {
    int deleteByPrimaryKey(Integer conponTypeId);

    int insert(Conpontype record);

    int insertSelective(Conpontype record);

    Conpontype selectByPrimaryKey(Integer conponTypeId);

    int updateByPrimaryKeySelective(Conpontype record);

    int updateByPrimaryKey(Conpontype record);
}
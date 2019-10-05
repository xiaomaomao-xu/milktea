package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Taskcenter;

public interface TaskcenterMapper {
    int deleteByPrimaryKey(Integer centerId);

    int insert(Taskcenter record);

    int insertSelective(Taskcenter record);

    Taskcenter selectByPrimaryKey(Integer centerId);

    int updateByPrimaryKeySelective(Taskcenter record);

    int updateByPrimaryKey(Taskcenter record);
}
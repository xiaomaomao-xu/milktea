package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Taskinfo;

public interface TaskinfoMapper {
    int deleteByPrimaryKey(Integer taskId);

    int insert(Taskinfo record);

    int insertSelective(Taskinfo record);

    Taskinfo selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(Taskinfo record);

    int updateByPrimaryKey(Taskinfo record);
}
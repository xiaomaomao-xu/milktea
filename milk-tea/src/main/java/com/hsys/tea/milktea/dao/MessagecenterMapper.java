package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Messagecenter;

public interface MessagecenterMapper {
    int deleteByPrimaryKey(Integer messageId);

    int insert(Messagecenter record);

    int insertSelective(Messagecenter record);

    Messagecenter selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(Messagecenter record);

    int updateByPrimaryKey(Messagecenter record);
}
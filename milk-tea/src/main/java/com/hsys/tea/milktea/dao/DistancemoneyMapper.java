package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Distancemoney;

public interface DistancemoneyMapper {
    int deleteByPrimaryKey(Integer distanceId);

    int insert(Distancemoney record);

    int insertSelective(Distancemoney record);

    Distancemoney selectByPrimaryKey(Integer distanceId);

    int updateByPrimaryKeySelective(Distancemoney record);

    int updateByPrimaryKey(Distancemoney record);
}
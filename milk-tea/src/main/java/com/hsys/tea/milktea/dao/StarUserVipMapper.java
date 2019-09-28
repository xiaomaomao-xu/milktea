package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.StarUserVip;

public interface StarUserVipMapper {
    int deleteByPrimaryKey(Integer svipId);

    int insert(StarUserVip record);

    int insertSelective(StarUserVip record);

    StarUserVip selectByPrimaryKey(Integer svipId);

    int updateByPrimaryKeySelective(StarUserVip record);

    int updateByPrimaryKey(StarUserVip record);
}
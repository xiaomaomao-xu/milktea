package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.UserVip;

public interface UserVipMapper {
    int deleteByPrimaryKey(Integer vipId);

    int insert(UserVip record);

    int insertSelective(UserVip record);

    UserVip selectByPrimaryKey(Integer vipId);

    int updateByPrimaryKeySelective(UserVip record);

    int updateByPrimaryKey(UserVip record);
}
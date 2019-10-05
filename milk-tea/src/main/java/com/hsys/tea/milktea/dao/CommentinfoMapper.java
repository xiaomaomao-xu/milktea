package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Commentinfo;

public interface CommentinfoMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Commentinfo record);

    int insertSelective(Commentinfo record);

    Commentinfo selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Commentinfo record);

    int updateByPrimaryKey(Commentinfo record);
}
package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.Userinfo;

public interface UserinfoMapper {
	List<Userinfo> findAllList();
	
    int deleteByPrimaryKey(Integer userId);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}
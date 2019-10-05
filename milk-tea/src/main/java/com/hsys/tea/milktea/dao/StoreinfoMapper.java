package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.Storeinfo;

public interface StoreinfoMapper {
	
	List<Storeinfo> findAllList();
	
    int deleteByPrimaryKey(Integer storeId);

    int insert(Storeinfo record);

    int insertSelective(Storeinfo record);

    Storeinfo selectByPrimaryKey(Integer storeId);

    int updateByPrimaryKeySelective(Storeinfo record);

    int updateByPrimaryKey(Storeinfo record);
}
package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.Commoditymaterial;

public interface CommoditymaterialMapper {
	List<Commoditymaterial> findAllList(Integer typeId);
	
    int deleteByPrimaryKey(Integer materialId);

    int insert(Commoditymaterial record);

    int insertSelective(Commoditymaterial record);

    Commoditymaterial selectByPrimaryKey(Integer materialId);

    int updateByPrimaryKeySelective(Commoditymaterial record);

    int updateByPrimaryKey(Commoditymaterial record);
    
    int updateByBatch(List<Commoditymaterial> records);
}
package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.Commodityinfo;

public interface CommodityinfoMapper {
	List<Commodityinfo> findAllList(Integer typeId);
	
	Commodityinfo getDetailCommodityinfo(Commodityinfo record);
	
    int deleteByPrimaryKey(Integer commodityId);

    int insert(Commodityinfo record);

    int insertSelective(Commodityinfo record);

    Commodityinfo selectByPrimaryKey(Integer commodityId);

    int updateByPrimaryKeySelective(Commodityinfo record);

    int updateByPrimaryKey(Commodityinfo record);
}
package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Sviptypeinfo;

public interface SviptypeinfoMapper {
    int deleteByPrimaryKey(Integer svipType);

    int insert(Sviptypeinfo record);

    int insertSelective(Sviptypeinfo record);

    Sviptypeinfo selectByPrimaryKey(Integer svipType);

    int updateByPrimaryKeySelective(Sviptypeinfo record);

    int updateByPrimaryKey(Sviptypeinfo record);
}
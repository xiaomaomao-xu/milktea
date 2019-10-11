package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.InfProductOfferingRel;

public interface InfProductOfferingRelMapper {
    int deleteByPrimaryKey(Integer prodOfferRelId);

    int insert(InfProductOfferingRel record);

    int insertSelective(InfProductOfferingRel record);

    InfProductOfferingRel selectByPrimaryKey(Integer prodOfferRelId);

    int updateByPrimaryKeySelective(InfProductOfferingRel record);

    int updateByPrimaryKey(InfProductOfferingRel record);

	InfProductOfferingRel selectByMaterialId(Integer materialId);
}
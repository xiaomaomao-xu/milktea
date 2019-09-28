package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.InfUserCouponRel;

public interface InfUserCouponRelMapper {
    int deleteByPrimaryKey(Integer relId);

    int insert(InfUserCouponRel record);

    int insertSelective(InfUserCouponRel record);

    InfUserCouponRel selectByPrimaryKey(Integer relId);

    int updateByPrimaryKeySelective(InfUserCouponRel record);

    int updateByPrimaryKey(InfUserCouponRel record);
}
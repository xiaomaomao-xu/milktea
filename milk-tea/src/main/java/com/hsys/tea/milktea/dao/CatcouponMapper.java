package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.Catcoupon;

public interface CatcouponMapper {
    int deleteByPrimaryKey(Integer couponId);

    int insert(Catcoupon record);

    int insertSelective(Catcoupon record);

    Catcoupon selectByPrimaryKey(Integer couponId);

    int updateByPrimaryKeySelective(Catcoupon record);

    int updateByPrimaryKey(Catcoupon record);
}
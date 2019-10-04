package com.hsys.tea.milktea.entity;

import java.util.Date;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class Catcoupon extends BaseEntity{

	private Integer couponId;

    private String couponName;

    private Integer couponState;

    private Date beginTime;

    private Date endTime;

    private Integer couponLimit;

    private Integer issuedNumber;

    private Integer useNumber;

    private Date getTime;

    private String couponRemark;

    private Integer couponType;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
        this.id = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public Integer getCouponState() {
        return couponState;
    }

    public void setCouponState(Integer couponState) {
        this.couponState = couponState;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCouponLimit() {
        return couponLimit;
    }

    public void setCouponLimit(Integer couponLimit) {
        this.couponLimit = couponLimit;
    }

    public Integer getIssuedNumber() {
        return issuedNumber;
    }

    public void setIssuedNumber(Integer issuedNumber) {
        this.issuedNumber = issuedNumber;
    }

    public Integer getUseNumber() {
        return useNumber;
    }

    public void setUseNumber(Integer useNumber) {
        this.useNumber = useNumber;
    }

    public Date getGetTime() {
        return getTime;
    }

    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public String getCouponRemark() {
        return couponRemark;
    }

    public void setCouponRemark(String couponRemark) {
        this.couponRemark = couponRemark == null ? null : couponRemark.trim();
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }
}
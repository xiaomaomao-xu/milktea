package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Catcoupon {
    private Integer couponId;

    private String couponName;

    private String couponImg;

    private Integer couponState;

    private Date beginTime;

    private Date endTime;

    private Integer couponLimit;

    private Integer issuedNumber;

    private Integer useNumber;

    private Date getTime;

    private String couponRemark;

    private Integer conponTypeId;

    private Integer ecoupon;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg == null ? null : couponImg.trim();
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

    public Integer getConponTypeId() {
        return conponTypeId;
    }

    public void setConponTypeId(Integer conponTypeId) {
        this.conponTypeId = conponTypeId;
    }

    public Integer getEcoupon() {
        return ecoupon;
    }

    public void setEcoupon(Integer ecoupon) {
        this.ecoupon = ecoupon;
    }
}
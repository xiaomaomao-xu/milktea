package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Conpontype {
    private Integer conponTypeId;

    private String couponName;

    private String couponRemark;

    private Date createTime;

    public Integer getConponTypeId() {
        return conponTypeId;
    }

    public void setConponTypeId(Integer conponTypeId) {
        this.conponTypeId = conponTypeId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public String getCouponRemark() {
        return couponRemark;
    }

    public void setCouponRemark(String couponRemark) {
        this.couponRemark = couponRemark == null ? null : couponRemark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
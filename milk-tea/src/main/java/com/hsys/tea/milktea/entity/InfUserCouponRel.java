package com.hsys.tea.milktea.entity;

import java.util.Date;

public class InfUserCouponRel {
    private Integer relId;

    private Integer vipId;

    private Integer svipId;

    private String coupons;

    private Date createTime;

    private Date modifyTime;

    public Integer getRelId() {
        return relId;
    }

    public void setRelId(Integer relId) {
        this.relId = relId;
    }

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public Integer getSvipId() {
        return svipId;
    }

    public void setSvipId(Integer svipId) {
        this.svipId = svipId;
    }

    public String getCoupons() {
        return coupons;
    }

    public void setCoupons(String coupons) {
        this.coupons = coupons == null ? null : coupons.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
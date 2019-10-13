package com.hsys.tea.milktea.entity;

import java.util.Date;

public class ShoppingbagdetailInfo {
    private Long bagDetailId;

    private Long bagId;

    private Integer materialId;

    private Date createTime;

    private Integer blacklist;

    public Long getBagDetailId() {
        return bagDetailId;
    }

    public void setBagDetailId(Long bagDetailId) {
        this.bagDetailId = bagDetailId;
    }

    public Long getBagId() {
        return bagId;
    }

    public void setBagId(Long bagId) {
        this.bagId = bagId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Integer blacklist) {
        this.blacklist = blacklist;
    }
}
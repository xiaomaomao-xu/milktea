package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Commoditytype {
    private Integer materialTypeId;

    private String materialTypeName;

    private String materialTypeRemark;

    private Integer storeId;

    private Date createTime;

    public Integer getMaterialTypeId() {
        return materialTypeId;
    }

    public void setMaterialTypeId(Integer materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName == null ? null : materialTypeName.trim();
    }

    public String getMaterialTypeRemark() {
        return materialTypeRemark;
    }

    public void setMaterialTypeRemark(String materialTypeRemark) {
        this.materialTypeRemark = materialTypeRemark == null ? null : materialTypeRemark.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
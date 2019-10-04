package com.hsys.tea.milktea.entity;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class Commoditytype extends BaseEntity{
    private Integer typeId;

    private String typeName;

    private String typeRemark;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
        this.id = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeRemark() {
        return typeRemark;
    }

    public void setTypeRemark(String typeRemark) {
        this.typeRemark = typeRemark == null ? null : typeRemark.trim();
    }
}
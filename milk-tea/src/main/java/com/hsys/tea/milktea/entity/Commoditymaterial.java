package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Commoditymaterial {
    private Integer materialId;

    private String materialName;

    private Integer materialPrice;

    private Integer materialQuantity;

    private String materialRemark;

    private Integer materialTypeId;

    private String imgthumb;

    private Integer limitNum;

    private Date createTime;

    private Date modifyTime;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public Integer getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(Integer materialPrice) {
        this.materialPrice = materialPrice;
    }

    public Integer getMaterialQuantity() {
        return materialQuantity;
    }

    public void setMaterialQuantity(Integer materialQuantity) {
        this.materialQuantity = materialQuantity;
    }

    public String getMaterialRemark() {
        return materialRemark;
    }

    public void setMaterialRemark(String materialRemark) {
        this.materialRemark = materialRemark == null ? null : materialRemark.trim();
    }

    public Integer getMaterialTypeId() {
        return materialTypeId;
    }

    public void setMaterialTypeId(Integer materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

    public String getImgthumb() {
        return imgthumb;
    }

    public void setImgthumb(String imgthumb) {
        this.imgthumb = imgthumb == null ? null : imgthumb.trim();
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
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
package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Commodityinfo {
    private Integer commodityId;

    private String commodityName;

    private Integer materialTypeId;

    private Integer commodityPrice;

    private Integer commodityQuantity;

    private String commodityLabel;

    private String commodityRemark;

    private Integer commodityState;

    private String materialId;

    private String imgthumb;

    private Date createTime;

    private Date modifyTime;

    private Integer storeId;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getMaterialTypeId() {
        return materialTypeId;
    }

    public void setMaterialTypeId(Integer materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

    public Integer getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommodityQuantity() {
        return commodityQuantity;
    }

    public void setCommodityQuantity(Integer commodityQuantity) {
        this.commodityQuantity = commodityQuantity;
    }

    public String getCommodityLabel() {
        return commodityLabel;
    }

    public void setCommodityLabel(String commodityLabel) {
        this.commodityLabel = commodityLabel == null ? null : commodityLabel.trim();
    }

    public String getCommodityRemark() {
        return commodityRemark;
    }

    public void setCommodityRemark(String commodityRemark) {
        this.commodityRemark = commodityRemark == null ? null : commodityRemark.trim();
    }

    public Integer getCommodityState() {
        return commodityState;
    }

    public void setCommodityState(Integer commodityState) {
        this.commodityState = commodityState;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }

    public String getImgthumb() {
        return imgthumb;
    }

    public void setImgthumb(String imgthumb) {
        this.imgthumb = imgthumb == null ? null : imgthumb.trim();
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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
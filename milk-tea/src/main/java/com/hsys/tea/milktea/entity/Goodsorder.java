package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Goodsorder {
    private Integer ordercommodityId;

    private Integer commodity;

    private String materialId;

    private String imgthumb;

    private String commodityName;

    private Integer commodityPrice;

    private Integer buyAmount;

    private Long orderId;

    private Date createTime;

    private String materialRemark;

    public Integer getOrdercommodityId() {
        return ordercommodityId;
    }

    public void setOrdercommodityId(Integer ordercommodityId) {
        this.ordercommodityId = ordercommodityId;
    }

    public Integer getCommodity() {
        return commodity;
    }

    public void setCommodity(Integer commodity) {
        this.commodity = commodity;
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

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Integer buyAmount) {
        this.buyAmount = buyAmount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMaterialRemark() {
        return materialRemark;
    }

    public void setMaterialRemark(String materialRemark) {
        this.materialRemark = materialRemark == null ? null : materialRemark.trim();
    }
}
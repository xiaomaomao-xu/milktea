package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Shoppingbag {
    private Integer bagId;

    private Integer storeId;

    private Integer scommodityId;

    private Integer userId;

    private Integer commodityQantity;

    private String materialId;

    private Integer scommodityPrice;

    private Date createTime;

    private Integer blacklist;

    public Integer getBagId() {
        return bagId;
    }

    public void setBagId(Integer bagId) {
        this.bagId = bagId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getScommodityId() {
        return scommodityId;
    }

    public void setScommodityId(Integer scommodityId) {
        this.scommodityId = scommodityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommodityQantity() {
        return commodityQantity;
    }

    public void setCommodityQantity(Integer commodityQantity) {
        this.commodityQantity = commodityQantity;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }

    public Integer getScommodityPrice() {
        return scommodityPrice;
    }

    public void setScommodityPrice(Integer scommodityPrice) {
        this.scommodityPrice = scommodityPrice;
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
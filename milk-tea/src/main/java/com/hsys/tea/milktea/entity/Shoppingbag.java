package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Shoppingbag {
    private Integer bagId;

    private Integer storeId;

    private Integer commodityId;

    private Integer userId;

    private Integer commodityQantity;

    private Date createTime;

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

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
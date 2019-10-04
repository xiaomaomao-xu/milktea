package com.hsys.tea.milktea.entity;

import java.util.Date;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class Commodityinfo extends BaseEntity{
    private Integer commodityId;

    private String commodityName;

    private Integer commodityType;

    private String commodityLabel;

    private String commodityHobby;

    private Integer goodsState;

    private Date putawayTime;

    private Integer commodityQuantity;

    private Date createTime;

    private Date modifyTime;

    private Integer commodityPrice;

    private Integer storeId;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
        this.id = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(Integer commodityType) {
        this.commodityType = commodityType;
    }

    public String getCommodityLabel() {
        return commodityLabel;
    }

    public void setCommodityLabel(String commodityLabel) {
        this.commodityLabel = commodityLabel == null ? null : commodityLabel.trim();
    }

    public String getCommodityHobby() {
        return commodityHobby;
    }

    public void setCommodityHobby(String commodityHobby) {
        this.commodityHobby = commodityHobby == null ? null : commodityHobby.trim();
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
    }

    public Integer getCommodityQuantity() {
        return commodityQuantity;
    }

    public void setCommodityQuantity(Integer commodityQuantity) {
        this.commodityQuantity = commodityQuantity;
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

    public Integer getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
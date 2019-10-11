package com.hsys.tea.milktea.entity;

import java.util.Date;
import java.util.List;

public class Shoppingbag {
    private Long bagId;

    private Integer storeId;

    private Integer scommodityId;

    private Integer userId;

    private Integer commodityQantity;

    private Integer scommodityPrice;

    private String purchaseDetail;

    private Date createTime;

    private Integer blacklist;
    
    private List<ShoppingbagDetailInfo> shoppingbagDetailInfos;

    public List<ShoppingbagDetailInfo> getShoppingbagDetailInfos() {
		return shoppingbagDetailInfos;
	}

	public void setShoppingbagDetailInfos(List<ShoppingbagDetailInfo> shoppingbagDetailInfos) {
		this.shoppingbagDetailInfos = shoppingbagDetailInfos;
	}

	public Long getBagId() {
        return bagId;
    }

    public void setBagId(Long bagId) {
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

    public Integer getScommodityPrice() {
        return scommodityPrice;
    }

    public void setScommodityPrice(Integer scommodityPrice) {
        this.scommodityPrice = scommodityPrice;
    }

    public String getPurchaseDetail() {
        return purchaseDetail;
    }

    public void setPurchaseDetail(String purchaseDetail) {
        this.purchaseDetail = purchaseDetail == null ? null : purchaseDetail.trim();
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
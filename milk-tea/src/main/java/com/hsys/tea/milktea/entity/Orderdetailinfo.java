package com.hsys.tea.milktea.entity;

import java.util.Date;
import java.util.List;

public class Orderdetailinfo {
    private Long orderDetailId;

    private Long orderId;

    private Integer commodityId;

    private Integer commodityNum;

    private Date orderTime;

    private String purchaseDetail;

    private Date createTime;

    private String commodityName;

    private String commodityImage;

    private Integer commodityPrice;

    private Long bagId;
    
    private List<Commodityinfo> commodityinfos;

    public List<Commodityinfo> getCommodityinfos() {
		return commodityinfos;
	}

	public void setCommodityinfos(List<Commodityinfo> commodityinfos) {
		this.commodityinfos = commodityinfos;
	}

	public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
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

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityImage() {
        return commodityImage;
    }

    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage == null ? null : commodityImage.trim();
    }

    public Integer getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Long getBagId() {
        return bagId;
    }

    public void setBagId(Long bagId) {
        this.bagId = bagId;
    }
}
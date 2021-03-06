package com.hsys.tea.milktea.entity;

import java.util.Date;
import java.util.List;

public class Orderinfo {
    private Long orderId;

    private Integer amount;

    private Integer offerNum;

    private String storePhone;

    private Integer coupon;

    private Date createTime;

    private Integer orderState;

    private Integer storeId;

    private Integer userId;

    private Integer pickupWay;

    private Integer shippingFee;

    private Integer addressId;

    private String remark;

    private Integer paymentType;
    
    private List<Orderdetailinfo> orderdetailinfos;
    
    private Storeinfo storeinfo;

    public Storeinfo getStoreinfo() {
		return storeinfo;
	}

	public void setStoreinfo(Storeinfo storeinfo) {
		this.storeinfo = storeinfo;
	}

	public List<Orderdetailinfo> getOrderdetailinfos() {
		return orderdetailinfos;
	}

	public void setOrderdetailinfos(List<Orderdetailinfo> orderdetailinfos) {
		this.orderdetailinfos = orderdetailinfos;
	}

	public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getOfferNum() {
        return offerNum;
    }

    public void setOfferNum(Integer offerNum) {
        this.offerNum = offerNum;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public Integer getCoupon() {
        return coupon;
    }

    public void setCoupon(Integer coupon) {
        this.coupon = coupon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPickupWay() {
        return pickupWay;
    }

    public void setPickupWay(Integer pickupWay) {
        this.pickupWay = pickupWay;
    }

    public Integer getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Integer shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }
}
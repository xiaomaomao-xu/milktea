package com.hsys.tea.milktea.entity;

import java.util.Date;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class Storeinfo extends BaseEntity{
    private Integer storeId;

    private String storeAccount;

    private String storePassword;

    private String storePhone;

    private String storeName;

    private String storeAddress;

    private String businessHours;

    private String shippingInstruction;

    private Integer deliveryCost;

    private Integer operatingStart;

    private Integer takeoutStart;

    private Date enterTime;

    private Integer turnover;

    private String latitude;

    private String longitude;

    private String notice;
    
    private String distance;
    
//    private List<>

    public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
        this.id = storeId;
    }

    public String getStoreAccount() {
        return storeAccount;
    }

    public void setStoreAccount(String storeAccount) {
        this.storeAccount = storeAccount == null ? null : storeAccount.trim();
    }

    public String getStorePassword() {
        return storePassword;
    }

    public void setStorePassword(String storePassword) {
        this.storePassword = storePassword == null ? null : storePassword.trim();
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours == null ? null : businessHours.trim();
    }

    public String getShippingInstruction() {
        return shippingInstruction;
    }

    public void setShippingInstruction(String shippingInstruction) {
        this.shippingInstruction = shippingInstruction == null ? null : shippingInstruction.trim();
    }

    public Integer getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(Integer deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public Integer getOperatingStart() {
        return operatingStart;
    }

    public void setOperatingStart(Integer operatingStart) {
        this.operatingStart = operatingStart;
    }

    public Integer getTakeoutStart() {
        return takeoutStart;
    }

    public void setTakeoutStart(Integer takeoutStart) {
        this.takeoutStart = takeoutStart;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }
}
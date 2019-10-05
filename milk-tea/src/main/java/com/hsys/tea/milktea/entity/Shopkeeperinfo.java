package com.hsys.tea.milktea.entity;

public class Shopkeeperinfo {
    private Integer shopkeeperId;

    private String principal;

    private Integer storeId;

    private String phone;

    private String business;

    private String idnumber;

    private String idcaidurlfront;

    private String idcaidurlreverse;

    private String openId;

    private String remark;

    public Integer getShopkeeperId() {
        return shopkeeperId;
    }

    public void setShopkeeperId(Integer shopkeeperId) {
        this.shopkeeperId = shopkeeperId;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getIdcaidurlfront() {
        return idcaidurlfront;
    }

    public void setIdcaidurlfront(String idcaidurlfront) {
        this.idcaidurlfront = idcaidurlfront == null ? null : idcaidurlfront.trim();
    }

    public String getIdcaidurlreverse() {
        return idcaidurlreverse;
    }

    public void setIdcaidurlreverse(String idcaidurlreverse) {
        this.idcaidurlreverse = idcaidurlreverse == null ? null : idcaidurlreverse.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
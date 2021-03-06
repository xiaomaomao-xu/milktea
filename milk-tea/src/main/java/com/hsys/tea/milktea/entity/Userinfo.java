package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Userinfo {
    private Integer userId;

    private String userName;

    private String userPhone;

    private Integer userSex;

    private Date userBirthday;

    private Integer userWallet;

    private Integer userIntegrals;

    private Integer userMonetary;

    private String paymentCode;

    private String openId;

    private String userAvatarUrl;

    private Date createTime;

    private Date modifyTime;

    private Integer userType;

    private String userPassword;

    private String salt;

    private Integer blacklist;

    private Integer userExp;

    private Integer userGrabe;

    private Integer userSvip;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getUserWallet() {
        return userWallet;
    }

    public void setUserWallet(Integer userWallet) {
        this.userWallet = userWallet;
    }

    public Integer getUserIntegrals() {
        return userIntegrals;
    }

    public void setUserIntegrals(Integer userIntegrals) {
        this.userIntegrals = userIntegrals;
    }

    public Integer getUserMonetary() {
        return userMonetary;
    }

    public void setUserMonetary(Integer userMonetary) {
        this.userMonetary = userMonetary;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl == null ? null : userAvatarUrl.trim();
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

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Integer blacklist) {
        this.blacklist = blacklist;
    }

    public Integer getUserExp() {
        return userExp;
    }

    public void setUserExp(Integer userExp) {
        this.userExp = userExp;
    }

    public Integer getUserGrabe() {
        return userGrabe;
    }

    public void setUserGrabe(Integer userGrabe) {
        this.userGrabe = userGrabe;
    }

    public Integer getUserSvip() {
        return userSvip;
    }

    public void setUserSvip(Integer userSvip) {
        this.userSvip = userSvip;
    }
}
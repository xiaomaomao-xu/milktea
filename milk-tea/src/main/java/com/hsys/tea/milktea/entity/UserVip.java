package com.hsys.tea.milktea.entity;

import java.util.Date;

public class UserVip {
    private Integer vipId;

    private Date createTime;

    private Integer userGoempirical;

    private Integer userId;

    private Integer grade;

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserGoempirical() {
        return userGoempirical;
    }

    public void setUserGoempirical(Integer userGoempirical) {
        this.userGoempirical = userGoempirical;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
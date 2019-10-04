package com.hsys.tea.milktea.entity;

import java.util.Date;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class UserVip extends BaseEntity{
    private Integer vipId;

    private Date createTime;

    private Integer userGoempirical;

    private Integer userId;

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
        this.id = vipId;
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
}
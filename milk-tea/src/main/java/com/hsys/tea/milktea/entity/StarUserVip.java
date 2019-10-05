package com.hsys.tea.milktea.entity;

import java.util.Date;

public class StarUserVip {
    private Integer svipId;

    private Date createTime;

    private Integer userStarEmpirical;

    private Integer userId;

    private Integer svipState;

    private Date effTime;

    private Date eptTime;

    private Integer vgrade;

    private Integer svipTypeId;

    public Integer getSvipId() {
        return svipId;
    }

    public void setSvipId(Integer svipId) {
        this.svipId = svipId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserStarEmpirical() {
        return userStarEmpirical;
    }

    public void setUserStarEmpirical(Integer userStarEmpirical) {
        this.userStarEmpirical = userStarEmpirical;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSvipState() {
        return svipState;
    }

    public void setSvipState(Integer svipState) {
        this.svipState = svipState;
    }

    public Date getEffTime() {
        return effTime;
    }

    public void setEffTime(Date effTime) {
        this.effTime = effTime;
    }

    public Date getEptTime() {
        return eptTime;
    }

    public void setEptTime(Date eptTime) {
        this.eptTime = eptTime;
    }

    public Integer getVgrade() {
        return vgrade;
    }

    public void setVgrade(Integer vgrade) {
        this.vgrade = vgrade;
    }

    public Integer getSvipTypeId() {
        return svipTypeId;
    }

    public void setSvipTypeId(Integer svipTypeId) {
        this.svipTypeId = svipTypeId;
    }
}
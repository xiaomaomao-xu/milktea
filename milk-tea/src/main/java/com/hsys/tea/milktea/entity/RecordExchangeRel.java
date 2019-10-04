package com.hsys.tea.milktea.entity;

import java.util.Date;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class RecordExchangeRel extends BaseEntity{
    private Integer relId;

    private Date createTime;

    private Long orderId;

    private Integer userId;

    public Integer getRelId() {
        return relId;
    }

    public void setRelId(Integer relId) {
        this.relId = relId;
        this.id = relId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
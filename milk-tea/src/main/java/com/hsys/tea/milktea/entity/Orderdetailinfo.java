package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Orderdetailinfo {
    private Long orderDetailId;

    private Long orderId;

    private Date createTime;

    private Integer offeringId;

    private Integer offeringNum;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOfferingId() {
        return offeringId;
    }

    public void setOfferingId(Integer offeringId) {
        this.offeringId = offeringId;
    }

    public Integer getOfferingNum() {
        return offeringNum;
    }

    public void setOfferingNum(Integer offeringNum) {
        this.offeringNum = offeringNum;
    }
}
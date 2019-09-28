package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Expensecalendar {
    private Integer expenseId;

    private Integer userId;

    private Long orderId;

    private Date expenseTime;

    private Integer expenseMoney;

    private Integer paymentType;

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getExpenseTime() {
        return expenseTime;
    }

    public void setExpenseTime(Date expenseTime) {
        this.expenseTime = expenseTime;
    }

    public Integer getExpenseMoney() {
        return expenseMoney;
    }

    public void setExpenseMoney(Integer expenseMoney) {
        this.expenseMoney = expenseMoney;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }
}
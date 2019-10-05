package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Commentinfo {
    private Integer commentId;

    private Long orderId;

    private Integer commentState;

    private String commentLabel;

    private String commentRemark;

    private Integer userId;

    private Integer storeId;

    private Date commentTime;

    private String commentImg;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }

    public String getCommentLabel() {
        return commentLabel;
    }

    public void setCommentLabel(String commentLabel) {
        this.commentLabel = commentLabel == null ? null : commentLabel.trim();
    }

    public String getCommentRemark() {
        return commentRemark;
    }

    public void setCommentRemark(String commentRemark) {
        this.commentRemark = commentRemark == null ? null : commentRemark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg == null ? null : commentImg.trim();
    }
}
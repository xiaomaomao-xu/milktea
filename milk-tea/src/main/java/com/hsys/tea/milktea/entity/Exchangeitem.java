package com.hsys.tea.milktea.entity;

import java.util.Date;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class Exchangeitem extends BaseEntity{
    private Integer itemId;

    private String itemName;

    private Integer itemNum;

    private Date createTime;

    private Date modifyTime;

    private Integer isCashCoupon;

    private Integer price;

    private Integer recordNum;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
        this.id = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
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

    public Integer getIsCashCoupon() {
        return isCashCoupon;
    }

    public void setIsCashCoupon(Integer isCashCoupon) {
        this.isCashCoupon = isCashCoupon;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }
}
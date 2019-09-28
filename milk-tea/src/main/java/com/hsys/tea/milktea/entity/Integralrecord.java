package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Integralrecord {
    private Integer recordId;

    private String recordExplain;

    private Date explainTime;

    private Integer integralQuantity;

    private Integer userId;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordExplain() {
        return recordExplain;
    }

    public void setRecordExplain(String recordExplain) {
        this.recordExplain = recordExplain == null ? null : recordExplain.trim();
    }

    public Date getExplainTime() {
        return explainTime;
    }

    public void setExplainTime(Date explainTime) {
        this.explainTime = explainTime;
    }

    public Integer getIntegralQuantity() {
        return integralQuantity;
    }

    public void setIntegralQuantity(Integer integralQuantity) {
        this.integralQuantity = integralQuantity;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
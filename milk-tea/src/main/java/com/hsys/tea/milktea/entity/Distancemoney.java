package com.hsys.tea.milktea.entity;

public class Distancemoney {
    private Integer distanceId;

    private Integer distance;

    private Integer money;

    private String remark;

    public Integer getDistanceId() {
        return distanceId;
    }

    public void setDistanceId(Integer distanceId) {
        this.distanceId = distanceId;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
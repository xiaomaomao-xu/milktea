package com.hsys.tea.milktea.entity;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class Distancemoney extends BaseEntity{
    private Integer distanceId;

    private Integer distance;

    private Integer money;

    public Integer getDistanceId() {
        return distanceId;
    }

    public void setDistanceId(Integer distanceId) {
        this.distanceId = distanceId;
        this.id = distanceId;
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
}
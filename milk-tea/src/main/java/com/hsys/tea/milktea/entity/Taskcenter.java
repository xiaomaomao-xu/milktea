package com.hsys.tea.milktea.entity;

import com.hsys.tea.milktea.comm.entity.BaseEntity;

public class Taskcenter extends BaseEntity{
    private Integer centerId;

    private Integer userId;

    private Integer taskId;

    private Integer perform;

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
        this.id = centerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getPerform() {
        return perform;
    }

    public void setPerform(Integer perform) {
        this.perform = perform;
    }
}
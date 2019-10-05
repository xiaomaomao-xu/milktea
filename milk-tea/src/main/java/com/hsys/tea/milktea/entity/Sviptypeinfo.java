package com.hsys.tea.milktea.entity;

import java.util.Date;

public class Sviptypeinfo {
    private Integer svipType;

    private String svipName;

    private Date createTime;

    private Date modifyTime;

    private String svipRemark;

    public Integer getSvipType() {
        return svipType;
    }

    public void setSvipType(Integer svipType) {
        this.svipType = svipType;
    }

    public String getSvipName() {
        return svipName;
    }

    public void setSvipName(String svipName) {
        this.svipName = svipName == null ? null : svipName.trim();
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

    public String getSvipRemark() {
        return svipRemark;
    }

    public void setSvipRemark(String svipRemark) {
        this.svipRemark = svipRemark == null ? null : svipRemark.trim();
    }
}
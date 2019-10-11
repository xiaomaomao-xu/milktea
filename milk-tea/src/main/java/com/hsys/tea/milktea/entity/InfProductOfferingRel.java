package com.hsys.tea.milktea.entity;

import java.util.Date;

public class InfProductOfferingRel {
    private Integer prodOfferRelId;

    private Integer materialId;

    private Integer commodityId;

    private Integer conflict;

    private Integer mustProd;

    private Date createTime;

    public Integer getProdOfferRelId() {
        return prodOfferRelId;
    }

    public void setProdOfferRelId(Integer prodOfferRelId) {
        this.prodOfferRelId = prodOfferRelId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getConflict() {
        return conflict;
    }

    public void setConflict(Integer conflict) {
        this.conflict = conflict;
    }

    public Integer getMustProd() {
        return mustProd;
    }

    public void setMustProd(Integer mustProd) {
        this.mustProd = mustProd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
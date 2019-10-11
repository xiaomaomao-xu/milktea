package com.hsys.tea.milktea.entity;

import java.util.Date;
import java.util.List;

public class Commoditytype {
    private Integer materialTypeId;

    private String materialTypeName;

    private String materialTypeRemark;

    private Integer storeId;

    private Date createTime;

    private Integer priority;

    private Integer isOffer;
	
	private List<Commodityinfo> commodityinfos;
	
	private List<Commoditymaterial> commoditymaterials;

	public List<Commoditymaterial> getCommoditymaterials() {
		return commoditymaterials;
	}

	public void setCommoditymaterials(List<Commoditymaterial> commoditymaterials) {
		this.commoditymaterials = commoditymaterials;
	}

	public List<Commodityinfo> getCommodityinfos() {
		return commodityinfos;
	}

	public void setCommodityinfos(List<Commodityinfo> commodityinfos) {
		this.commodityinfos = commodityinfos;
	}

    public Integer getMaterialTypeId() {
        return materialTypeId;
    }

    public void setMaterialTypeId(Integer materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName == null ? null : materialTypeName.trim();
    }

    public String getMaterialTypeRemark() {
        return materialTypeRemark;
    }

    public void setMaterialTypeRemark(String materialTypeRemark) {
        this.materialTypeRemark = materialTypeRemark == null ? null : materialTypeRemark.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getIsOffer() {
        return isOffer;
    }

    public void setIsOffer(Integer isOffer) {
        this.isOffer = isOffer;
    }
}
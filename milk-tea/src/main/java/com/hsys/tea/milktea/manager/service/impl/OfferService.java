package com.hsys.tea.milktea.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.CommodityinfoMapper;
import com.hsys.tea.milktea.dao.InfProductOfferingRelMapper;
import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.InfProductOfferingRel;

@Service
public class OfferService {
	@Autowired
	private CommodityinfoMapper cm;
	
	@Autowired
	private InfProductOfferingRelMapper iporm;
	
	public String getAllOffer(Commodityinfo offer) {
		return JSONArray.toJSONString(cm.findAllList(offer.getMaterialTypeId()));
	}
	
	public String getOffer(Commodityinfo offer) {
		return JSONObject.toJSONString(cm.selectByPrimaryKey(offer.getCommodityId()));
	}
	
	public String savaOffer(Commodityinfo offer) {
		if(offer.getCommodityId() != null) {
			int response = cm.updateByPrimaryKey(offer);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		int response = cm.insert(offer);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	public String deleteOffer(Commodityinfo offer) {
		int response = cm.deleteByPrimaryKey(offer.getCommodityId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	public String addProdOfferRel(InfProductOfferingRel rel) {
		int response = iporm.insert(rel);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	public String deleteProdOfferRel(InfProductOfferingRel rel) {
		int response = iporm.deleteByPrimaryKey(rel.getProdOfferRelId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	public String addOfferExclusion(InfProductOfferingRel rel) {
		int response1 = iporm.updateByPrimaryKey(rel);
		if(response1 <= 0) {
			return ConfigConstant.renewalfaling;
		}
		InfProductOfferingRel erel = iporm.selectByMaterialId(rel.getConflict());
		erel.setConflict(rel.getMaterialId());
		int response2 = iporm.updateByPrimaryKey(erel);
		if(response2 > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	public String cancelOfferExclusion(InfProductOfferingRel rel) {
		int response1 = iporm.updateByPrimaryKey(rel);
		if(response1 <= 0) {
			return ConfigConstant.renewalfaling;
		}
		InfProductOfferingRel erel = iporm.selectByMaterialId(rel.getConflict());
		erel.setMaterialId(rel.getConflict());
		erel.setConflict(rel.getMaterialId());
		int response2 = iporm.updateByPrimaryKey(erel);
		if(response2 > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

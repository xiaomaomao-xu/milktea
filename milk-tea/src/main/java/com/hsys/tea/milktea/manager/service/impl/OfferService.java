package com.hsys.tea.milktea.manager.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.CommodityinfoMapper;
import com.hsys.tea.milktea.dao.InfProductOfferingRelMapper;
import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.InfProductOfferingRel;
import com.hsys.tea.milktea.manager.service.IOfferService;

@Service
public class OfferService implements IOfferService{
	@Autowired
	private CommodityinfoMapper cm;
	
	@Autowired
	private InfProductOfferingRelMapper iporm;
	
	@Override
	public String getAllOffer(Commodityinfo offer) {
		return JSONArray.toJSONString(cm.findAllList(offer.getMaterialTypeId()));
	}
	
	@Override
	public String getOffer(Commodityinfo offer) {
		return JSONObject.toJSONString(cm.selectByPrimaryKey(offer.getCommodityId()));
	}
	
	@Override
	@Transactional
	public String savaOffer(Commodityinfo offer) {
		if(offer.getCommodityId() != null) {
			offer.setModifyTime(new Date());
			int response = cm.updateByPrimaryKey(offer);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		offer.setCreateTime(new Date());
		offer.setModifyTime(new Date());
		int response = cm.insert(offer);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	@Override
	@Transactional
	public String deleteOffer(Commodityinfo offer) {
		int response = cm.deleteByPrimaryKey(offer.getCommodityId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	@Override
	@Transactional
	public String addProdOfferRel(InfProductOfferingRel rel) {
		rel.setCreateTime(new Date());
		int response = iporm.insert(rel);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	@Override
	@Transactional
	public String deleteProdOfferRel(InfProductOfferingRel rel) {
		int response = iporm.deleteByPrimaryKey(rel.getProdOfferRelId());
		if(response <= 0) {
			return ConfigConstant.renewalfaling;
		}
		InfProductOfferingRel erel = iporm.selectByMaterialId(rel.getConflict());
		erel.setConflict(null);
		int response2 = iporm.updateByPrimaryKey(erel);
		if(response2 > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	@Override
	@Transactional
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
	
	@Override
	@Transactional
	public String cancelOfferExclusion(InfProductOfferingRel rel) {
		int response1 = iporm.updateByPrimaryKey(rel);
		if(response1 <= 0) {
			return ConfigConstant.renewalfaling;
		}
		InfProductOfferingRel erel = iporm.selectByMaterialId(rel.getConflict());
		erel.setConflict(null);
		int response2 = iporm.updateByPrimaryKey(erel);
		if(response2 > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

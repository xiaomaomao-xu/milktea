package com.hsys.tea.milktea.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.CommoditytypeMapper;
import com.hsys.tea.milktea.entity.Commoditytype;
import com.hsys.tea.milktea.manager.service.IProdOfferTypeService;

@Service
public class ProdOfferTypeService implements IProdOfferTypeService{
	@Autowired
	private CommoditytypeMapper cm;
	
	@Override
	public String getAllOfferType(Commoditytype type) {
		return JSONArray.toJSONString(cm.findAllOfferList(type.getStoreId()));
	}
	
	@Override
	public String gerALLprodType(Commoditytype type) {
		return JSONArray.toJSONString(cm.findAllPordList(type.getStoreId()));
	}
	
	@Override
	public String getType(Commoditytype type) {
		return JSONObject.toJSONString(cm.selectByPrimaryKey(type.getMaterialTypeId()));
	}
	
	@Override
	@Transactional
	public String savaType(Commoditytype type) {
		if(type.getMaterialTypeId() != null) {
			int response = cm.updateByPrimaryKey(type);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		int response = cm.insert(type);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	@Override
	@Transactional
	public String deleteType(Commoditytype type) {
		int response = cm.deleteByPrimaryKey(type.getMaterialTypeId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

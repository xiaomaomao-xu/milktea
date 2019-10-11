package com.hsys.tea.milktea.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.CommoditymaterialMapper;
import com.hsys.tea.milktea.entity.Commoditymaterial;

@Service
public class ProductService {
	@Autowired
	private CommoditymaterialMapper cm;
	
	public String getAllProduct(Commoditymaterial material) {
		return JSONArray.toJSONString(cm.findAllList(material.getMaterialTypeId()));
	}
	
	public String getProduct(Commoditymaterial material) {
		return JSONObject.toJSONString(cm.selectByPrimaryKey(material.getMaterialId()));
	}
	
	public String saveProduct(Commoditymaterial material) {
		if(material.getMaterialId() != null) {
			int response = cm.updateByPrimaryKey(material);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		int response = cm.insert(material);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	public String deleteProduct(Commoditymaterial material) {
		int response = cm.deleteByPrimaryKey(material.getMaterialId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
		
	}
}

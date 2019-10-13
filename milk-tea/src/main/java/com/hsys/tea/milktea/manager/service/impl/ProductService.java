package com.hsys.tea.milktea.manager.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.CommoditymaterialMapper;
import com.hsys.tea.milktea.entity.Commoditymaterial;
import com.hsys.tea.milktea.manager.service.IProductService;

@Service
public class ProductService implements IProductService{
	@Autowired
	private CommoditymaterialMapper cm;
	
	@Override
	public String getAllProduct(Commoditymaterial material) {
		return JSONArray.toJSONString(cm.findAllList(material.getMaterialTypeId()));
	}
	
	@Override
	public String getProduct(Commoditymaterial material) {
		return JSONObject.toJSONString(cm.selectByPrimaryKey(material.getMaterialId()));
	}
	
	@Override
	@Transactional
	public String saveProduct(Commoditymaterial material) {
		if(material.getMaterialId() != null) {
			material.setModifyTime(new Date());
			int response = cm.updateByPrimaryKey(material);
			if(response > 0) {
				return ConfigConstant.renewalwin;
			}
			return ConfigConstant.renewalfaling;
		}
		material.setCreateTime(new Date());
		int response = cm.insert(material);
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	@Override
	@Transactional
	public String deleteProduct(Commoditymaterial material) {
		int response = cm.deleteByPrimaryKey(material.getMaterialId());
		if(response > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
}

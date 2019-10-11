package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Commoditytype;
import com.hsys.tea.milktea.manager.service.impl.ProdOfferTypeService;

@Controller
public class ProdOfferTypeContorller {
	@Autowired
	private ProdOfferTypeService pots;
	
	@RequestMapping("/getAllOfferType")
	@ResponseBody
	public String getAllOfferType(Commoditytype type) {
		return pots.getAllOfferType(type);
	}
	
	@RequestMapping("/getAllPordType")
	@ResponseBody
	public String getAllPordType(Commoditytype type) {
		return pots.gerALLprodType(type);
	}
	
	@RequestMapping("/getType")
	@ResponseBody
	public String getType(Commoditytype type) {
		return pots.getType(type);
	}
	
	@RequestMapping("/savaType")
	@ResponseBody
	public String savaType(Commoditytype type) {
		return pots.savaType(type);
	}
	
	@RequestMapping("/deleteType")
	@ResponseBody
	public String deleteType(Commoditytype type) {
		return pots.deleteType(type);
	}
}

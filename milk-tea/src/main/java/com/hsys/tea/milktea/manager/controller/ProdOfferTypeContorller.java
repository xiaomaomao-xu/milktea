package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Commoditytype;
import com.hsys.tea.milktea.manager.service.IProdOfferTypeService;

@Controller
public class ProdOfferTypeContorller {
	@Autowired
	private IProdOfferTypeService pots;
	
	@RequestMapping("/getAllOfferType.do")
	@ResponseBody
	public String getAllOfferType(Commoditytype type) {
		return pots.getAllOfferType(type);
	}
	
	@RequestMapping("/getAllPordType.do")
	@ResponseBody
	public String getAllPordType(Commoditytype type) {
		return pots.gerALLprodType(type);
	}
	
	@RequestMapping("/getType.do")
	@ResponseBody
	public String getType(Commoditytype type) {
		return pots.getType(type);
	}
	
	@RequestMapping("/savaType.do")
	@ResponseBody
	public String savaType(Commoditytype type) {
		return pots.savaType(type);
	}
	
	@RequestMapping("/deleteType.do")
	@ResponseBody
	public String deleteType(Commoditytype type) {
		return pots.deleteType(type);
	}
}

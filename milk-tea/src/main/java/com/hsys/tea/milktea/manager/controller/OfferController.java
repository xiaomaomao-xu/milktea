package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.InfProductOfferingRel;
import com.hsys.tea.milktea.manager.service.impl.OfferService;

@Controller
public class OfferController {
	@Autowired
	private OfferService os;
	
	@RequestMapping("/getAllOffer")
	@ResponseBody
	public String getAllOffer(Commodityinfo offer) {
		return os.getAllOffer(offer);
	}
	
	@RequestMapping("/getOffer")
	@ResponseBody
	public String getOffer(Commodityinfo offer) {
		return os.getOffer(offer);
	}
	
	@RequestMapping("/savaOffer")
	@ResponseBody
	public String savaOffer(Commodityinfo offer) {
		return os.savaOffer(offer);
	}
	
	@RequestMapping("/deleteOffer")
	@ResponseBody
	public String deleteOffer(Commodityinfo offer) {
		return os.deleteOffer(offer);
	}
	
	@RequestMapping("/addProdOfferRel")
	@ResponseBody
	public String addProdOfferRel(InfProductOfferingRel rel) {
		return os.addProdOfferRel(rel);
	}
	
	@RequestMapping("/deleteProdOfferRel")
	@ResponseBody
	public String deleteProdOfferRel(InfProductOfferingRel rel) {
		return os.deleteProdOfferRel(rel);
	}
	
	@RequestMapping("/addOfferExclusion")
	@ResponseBody
	public String addOfferExclusion(InfProductOfferingRel rel) {
		return os.addOfferExclusion(rel);
	}
	
	@RequestMapping("/cancelOfferExclusion")
	@ResponseBody
	public String cancelOfferExclusion(InfProductOfferingRel rel) {
		return os.addOfferExclusion(rel);
	}
}

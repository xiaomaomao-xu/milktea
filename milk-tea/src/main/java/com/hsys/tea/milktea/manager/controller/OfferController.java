package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.InfProductOfferingRel;
import com.hsys.tea.milktea.manager.service.IOfferService;

@Controller
public class OfferController {
	@Autowired
	private IOfferService os;
	
	@RequestMapping("/getAllOffer.do")
	@ResponseBody
	public String getAllOffer(Commodityinfo offer) {
		return os.getAllOffer(offer);
	}
	
	@RequestMapping("/getOffer.do")
	@ResponseBody
	public String getOffer(Commodityinfo offer) {
		return os.getOffer(offer);
	}
	
	@RequestMapping("/savaOffer.do")
	@ResponseBody
	public String savaOffer(Commodityinfo offer) {
		return os.savaOffer(offer);
	}
	
	@RequestMapping("/deleteOffer.do")
	@ResponseBody
	public String deleteOffer(Commodityinfo offer) {
		return os.deleteOffer(offer);
	}
	
	@RequestMapping("/addProdOfferRel.do")
	@ResponseBody
	public String addProdOfferRel(InfProductOfferingRel rel) {
		return os.addProdOfferRel(rel);
	}
	
	@RequestMapping("/deleteProdOfferRel.do")
	@ResponseBody
	public String deleteProdOfferRel(InfProductOfferingRel rel) {
		return os.deleteProdOfferRel(rel);
	}
	
	@RequestMapping("/addOfferExclusion.do")
	@ResponseBody
	public String addOfferExclusion(InfProductOfferingRel rel) {
		return os.addOfferExclusion(rel);
	}
	
	@RequestMapping("/cancelOfferExclusion.do")
	@ResponseBody
	public String cancelOfferExclusion(InfProductOfferingRel rel) {
		return os.addOfferExclusion(rel);
	}
}

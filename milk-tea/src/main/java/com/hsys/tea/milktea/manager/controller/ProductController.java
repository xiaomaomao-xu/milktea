package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Commoditymaterial;
import com.hsys.tea.milktea.manager.service.IProductService;
@Service
public class ProductController {
	
	@Autowired
	private IProductService ps;
	
	@RequestMapping("/getAllProduct.do")
	@ResponseBody
	public String getAllProduct(Commoditymaterial material) {
		return ps.getAllProduct(material);
	}
	
	@RequestMapping("/getProduct.do")
	@ResponseBody
	public String getProduct(Commoditymaterial material) {
		return ps.getProduct(material);
	}
	
	@RequestMapping("/savaProduct.do")
	@ResponseBody
	public String savaProduct(Commoditymaterial material) {
		return ps.saveProduct(material);
	}
	
	@RequestMapping("/deleteProduct.do")
	@ResponseBody
	public String deleteProduct(Commoditymaterial material) {
		return ps.deleteProduct(material);
	}
}

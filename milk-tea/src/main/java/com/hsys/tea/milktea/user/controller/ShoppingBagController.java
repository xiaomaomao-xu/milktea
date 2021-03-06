package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.entity.Shoppingbag;
import com.hsys.tea.milktea.user.service.IShoppingBagService;

@Controller
@RequestMapping("/bag")
public class ShoppingBagController {
	
	@Autowired
	private IShoppingBagService sbs;
	
	@RequestMapping("/findCurrentUserBag.do")
	@ResponseBody
	public String findCurrentUserBag(Shoppingbag shoppingbag) {
		return sbs.findCurrentUserBag(shoppingbag);
		
	}
	
	@RequestMapping("/saveCurrentUserBag.do")
	@ResponseBody
	public String saveCurrentUserBag(String shoppingbagData) {
		JSONObject shoppingbagJson = JSONObject.parseObject(shoppingbagData);
		Shoppingbag shoppingbag = JSON.toJavaObject(shoppingbagJson,Shoppingbag.class);
		return sbs.saveCurrentUserBag(shoppingbag);
	}
}

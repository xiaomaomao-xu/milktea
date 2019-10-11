package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.entity.Shoppingbag;
import com.hsys.tea.milktea.user.service.Impl.ShoppingBagService;

@Controller
@RequestMapping("/bag")
public class ShoppingBagController {
	
	@Autowired
	private ShoppingBagService sbs;
	
	@RequestMapping("/findCurrentUserBag")
	@ResponseBody
	public String findCurrentUserBag(Shoppingbag shoppingbag) {
		return sbs.findCurrentUserBag(shoppingbag);
		
	}
	
	@RequestMapping("/addCurrentUserBag")
	@ResponseBody
	public String addCurrentUserBag(String shoppingbagData) {
		JSONObject shoppingbagJson = JSONObject.parseObject(shoppingbagData);
		Shoppingbag shoppingbag = JSON.toJavaObject(shoppingbagJson,Shoppingbag.class);
		return sbs.addCurrentUserBag(shoppingbag);
	}
	
	public String updateCurrentUserBag(Shoppingbag shoppingbag) {
		return sbs.updateCurrentUserBag(shoppingbag);
	}
}

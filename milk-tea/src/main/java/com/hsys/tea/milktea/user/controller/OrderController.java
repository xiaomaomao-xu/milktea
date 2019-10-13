package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.entity.Orderinfo;
import com.hsys.tea.milktea.user.service.IOrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private IOrderService os;
	
	@RequestMapping("/insertCurrentUserOrder.do")
	@ResponseBody
	public String insertCurrentUserOrder(String orderinfoData) {
		JSONObject shoppingbagJson = JSONObject.parseObject(orderinfoData);
		Orderinfo orderinfo = JSON.toJavaObject(shoppingbagJson,Orderinfo.class);
		return os.insertCurrentUserOrder(orderinfo);
	}
	
	@RequestMapping("/getOrderinfo.do")
	@ResponseBody
	public String getOrderinfo(Orderinfo orderinfo) {
		return os.getOrderinfo(orderinfo);
	}
	
	@RequestMapping("/getDetailOrderinfo.do")
	@ResponseBody
	public String getDetailOrderinfo(Orderinfo orderinfo) {
		return os.getDetailOrderinfo(orderinfo);
	}
	
	@RequestMapping("/updateOrder.do")
	@ResponseBody
	public String updateOrder(Orderinfo orderinfo) {
		return os.updateOrder(orderinfo);
	}
}

package com.hsys.tea.milktea.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.wenxin.wxpay.message;

@Controller
public class UserAdviceController {
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 下单成功通知
	 * @return
	 */
	@RequestMapping("/orderPaySuc.do")
	@ResponseBody
	public String orderPaySuc(String amount, String offerName, String takeFood, String storeName, String warmPrompt) {
		HttpSession session = request.getSession();
		String openId = (String) session.getAttribute("openId");
		return message.messageSend1(openId, amount, offerName, takeFood, storeName, warmPrompt).toJSONString();
	}
	
	/**
	 * 取餐通知
	 * @return
	 */
	@RequestMapping("/takeFoodNotity.do")
	@ResponseBody
	public String takeFoodNotity(String takeFood, String storeName, String address, String productsDetails, String warmPrompt) {
		HttpSession session = request.getSession();
		String openId = (String) session.getAttribute("openId");
		return message.messageSend2(openId, takeFood, storeName, address, productsDetails, warmPrompt).toJSONString();
	}
	
	/**
	 * 订单评价提醒通知
	 * @return
	 */
	@RequestMapping("/orderCommentNotity.do")
	@ResponseBody
	public String orderCommentNotity(String storeName, String orderStatus, String shopName, String orderId, String orderTime, String warmPrompt) {
		HttpSession session = request.getSession();
		String openId = (String) session.getAttribute("openId");
		return message.messageSend3(openId, storeName, orderStatus, shopName, orderId, orderTime, warmPrompt).toJSONString();
	}
}

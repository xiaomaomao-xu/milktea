package com.hsys.tea.milktea.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.user.service.Impl.PayService;

@Controller
public class PayController {
	@Autowired
	private PayService ps;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 统一下单
	 * @param commodityRemark
	 * @param commodityPrice
	 * @param notity_url
	 * @return
	 */
	@RequestMapping("/dealPay.do")
	@ResponseBody
	public String dealPay(String commodityRemark, String commodityPrice,String notityUrl) {
		HttpSession session = request.getSession();
		String remoteAddr = request.getRemoteAddr();
		String openId = (String) session.getAttribute("openId");
		return ps.dealPay(commodityRemark, commodityPrice, openId, remoteAddr, notityUrl);
	}
	
	/**
	 * 获取返回信息地址
	 * @param result
	 * @return
	 */
	@RequestMapping("/getPayInfo.do")
	public void getPayInfo() {
	}
}

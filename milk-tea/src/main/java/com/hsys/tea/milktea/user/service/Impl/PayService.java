package com.hsys.tea.milktea.user.service.Impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.dao.UserinfoMapper;
import com.hsys.tea.milktea.entity.Userinfo;
import com.hsys.tea.milktea.utils.SequenceNumberUtils;
import com.hsys.tea.milktea.wenxin.wxpay.Wxpay;

@Service
public class PayService {
	
	@Autowired
	private UserinfoMapper um;
	
	
	public String dealPay(String commodityRemark, String commodityPrice, String openId, String remoteAddr, String notity_url) {
		Userinfo user = um.selectByOpenId(openId);
		String orderId = SequenceNumberUtils.getInstance().getOrderCode(new Long(user.getUserId()));
		Wxpay pay = new Wxpay();
		try {
			Map<String, String> wxpay = pay.wxpay(orderId, commodityRemark, commodityPrice, openId, remoteAddr, notity_url);
			if("SUCCESS".equals(wxpay.get("return_code")) && "SUCCESS".equals(wxpay.get("result_code"))){
				wxpay.put("orderId", orderId);
				return JSONObject.toJSONString(wxpay);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
}

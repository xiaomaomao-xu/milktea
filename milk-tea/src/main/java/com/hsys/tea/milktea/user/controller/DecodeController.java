package com.hsys.tea.milktea.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.utils.Decode;

/**
 * 用来前端进行调用解码微信登录信息的接口
 * @author Administrator
 *
 */
@Controller
public class DecodeController {
	
	@RequestMapping("/getUserInfo.do")
	@ResponseBody
	public String userInfocode(String encryptedData,String sessionkey,String iv) {
		return Decode.getUserInfo(encryptedData, sessionkey, iv).toJSONString();
	}
}

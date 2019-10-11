package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Shippingaddressinfo;
import com.hsys.tea.milktea.user.service.Impl.UserAddressService;

@Controller
public class UserAddressController {
	@Autowired
	private UserAddressService us;
	
	@RequestMapping("/getUserAllAddress")
	@ResponseBody
	public String getUserAllAddress(Shippingaddressinfo address) {
		return us.getUserAllAddress(address);
	}
	
	@RequestMapping("/getUserAddress")
	@ResponseBody
	public String getUserAddress(Shippingaddressinfo address) {
		return us.getUserAddress(address);
	}
	
	@RequestMapping("/savaUserAddress")
	@ResponseBody
	public String savaUserAddress(Shippingaddressinfo address) {
		return us.savaUserAddress(address);
	}
	
	@RequestMapping("/deleteUserAddress")
	@ResponseBody
	public String deleteUserAddress(Shippingaddressinfo address) {
		return us.deleteUserAddress(address);
	}
}

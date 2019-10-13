package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.user.service.IAddressService;

@Controller
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private IAddressService is; 
	
	@RequestMapping("/getSelectCityStoreinfos.do")
	@ResponseBody
	public String getSelectCityStoreinfos (String userAddress, String longitude, String latitude) {
		return is.getSelectCityStoreinfos(userAddress, longitude, latitude);
	}
	
	@RequestMapping("/getdefaultCityStoreinfos.do")
	@ResponseBody
	public String getdefaultCityStoreinfos(String longitude, String latitude){
		return is.getdefaultCityStoreinfos(longitude, latitude);
	}
	
	@RequestMapping("/findaddress.do")
	@ResponseBody
	public String getAllAddress() {
		return is.getAllAddress();
	}
	
	
	
}

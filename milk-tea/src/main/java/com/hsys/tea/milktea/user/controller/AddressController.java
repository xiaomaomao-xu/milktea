package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.user.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService is; 
	
	@RequestMapping("/getCurrentCityStoreinfos")
	@ResponseBody
	public String getCurrentCityStoreinfos (String userAddress, String longitude, String latitude) {
		return is.getCurrentCityStoreinfos(userAddress, longitude, latitude);
	}
	
	@RequestMapping("/getdefaultCityStoreinfos")
	@ResponseBody
	public String getdefaultCityStoreinfos(String longitude, String latitude){
		return is.getdefaultCityStoreinfos(longitude, latitude);
	}
	
	@RequestMapping("/findaddress")
	@ResponseBody
	public String getAllAddress() {
		return is.getAllAddress();
	}
}

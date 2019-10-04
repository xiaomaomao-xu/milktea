package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.user.service.IndexService;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	private IndexService is; 
	
	@RequestMapping("/getCurrentCityStoreinfos")
	@ResponseBody
	public String getCurrentCityStoreinfos (String userAddress, String longitude, String latitude) {
		String isCurrentCity = is.getCurrentCityStoreinfos(userAddress, longitude, latitude);
		return isCurrentCity;
	}
	
	@RequestMapping("/getdefaultCityStoreinfos")
	@ResponseBody
	public String getdefaultCityStoreinfos(String userAddress, String longitude, String latitude){
		
		return null;
	}
}

package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Shopkeeperinfo;
import com.hsys.tea.milktea.manager.service.IStoreOwnerService;

@Controller
public class StoreOwnerController {
	
	@Autowired
	private IStoreOwnerService sos;
	
	@RequestMapping("/getStoreOwnerInfo.do")
	@ResponseBody
	public String getStoreOwnerInfo(Shopkeeperinfo ownerInfo) {
		return sos.getStoreOwnerInfo(ownerInfo);
	}
	
	@RequestMapping("/savaStoreOwnerInfo.do")
	@ResponseBody
	public String savaStoreOwnerInfo(Shopkeeperinfo ownerInfo) {
		return sos.savaStoreOwnerInfo(ownerInfo);
	}
	
	@RequestMapping("/deleteStoreOwnerInfo.do")
	@ResponseBody
	public String deleteStoreOwnerInfo(Shopkeeperinfo ownerInfo) {
		return sos.deleteStoreOwnerInfo(ownerInfo);
	}
}

package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Userinfo;
import com.hsys.tea.milktea.manager.service.impl.ManagerService;

@Controller
public class ManagerController {
	@Autowired
	private ManagerService ms;
	
	@RequestMapping("/getAllManager")
	@ResponseBody
	public String getAllManager() {
		return ms.getAllManager();
	}
	
	@RequestMapping("/getManager")
	@ResponseBody
	public String getManager(Userinfo manager) {
		return ms.getManager(manager);
	}
	
	@RequestMapping("/savaManager")
	@ResponseBody
	public String savaManager(Userinfo manager) {
		return ms.savaManager(manager);
	}
	
	@RequestMapping("/deleteManager")
	@ResponseBody
	public String deleteManager(Userinfo manager) {
		return ms.deleteManager(manager);
	}
}

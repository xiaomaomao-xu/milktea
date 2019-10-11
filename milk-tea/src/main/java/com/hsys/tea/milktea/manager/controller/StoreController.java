package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Storeinfo;
import com.hsys.tea.milktea.manager.service.impl.StoreService;

public class StoreController {
	
	@Autowired
	private StoreService ss;
	
	@RequestMapping("/getAllStore")
	@ResponseBody
	public String getAllStore() {
		return ss.getAllStore();
	}
	
	@RequestMapping("/getStore")
	@ResponseBody
	public String getStore(Storeinfo store) {
		return ss.getStore(store);
	}
	
	@RequestMapping("/savetStore")
	@ResponseBody
	public String savetStore(Storeinfo store) {
		return ss.saveStore(store);
	}
	
	@RequestMapping("/deleteStore")
	@ResponseBody
	public String deleteStore(Storeinfo store) {
		return ss.deleteStore(store);
	}
}

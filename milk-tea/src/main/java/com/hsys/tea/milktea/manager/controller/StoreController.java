package com.hsys.tea.milktea.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Storeinfo;
import com.hsys.tea.milktea.manager.service.IStoreService;

public class StoreController {
	
	@Autowired
	private IStoreService ss;
	
	@RequestMapping("/getAllStore.do")
	@ResponseBody
	public String getAllStore() {
		return ss.getAllStore();
	}
	
	@RequestMapping("/getStore.do")
	@ResponseBody
	public String getStore(Storeinfo store) {
		return ss.getStore(store);
	}
	
	@RequestMapping("/savetStore.do")
	@ResponseBody
	public String savetStore(Storeinfo store) {
		return ss.saveStore(store);
	}
	
	@RequestMapping("/deleteStore.do")
	@ResponseBody
	public String deleteStore(Storeinfo store) {
		return ss.deleteStore(store);
	}
}

package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.Storeinfo;
import com.hsys.tea.milktea.user.service.Impl.UserStoreService;

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	private UserStoreService ss;
	
	@RequestMapping("/getDetailStoreinfo")
	@ResponseBody
	public String getDetailStoreinfo(Storeinfo store) {
		return ss.getDetailStoreinfo(store);
	}
	
	@RequestMapping("/getDetailCommodityinfo")
	@ResponseBody
	public String getDetailCommodityinfo(Commodityinfo commodityinfo) {
		return ss.getDetailCommodityinfo(commodityinfo);
	}
}

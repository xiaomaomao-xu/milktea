package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.Storeinfo;
import com.hsys.tea.milktea.user.service.IUserStoreService;

@Controller
@RequestMapping("/store")
public class UserStoreController {
	
	@Autowired
	private IUserStoreService ss;
	
	@RequestMapping("/getDetailStoreinfo.do")
	@ResponseBody
	public String getDetailStoreinfo(Storeinfo store) {
		return ss.getDetailStoreinfo(store);
	}
	
	@RequestMapping("/getDetailCommodityinfo.do")
	@ResponseBody
	public String getDetailCommodityinfo(Commodityinfo commodityinfo) {
		return ss.getDetailCommodityinfo(commodityinfo);
	}
}

package com.hsys.tea.milktea.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.hsys.tea.milktea.entity.Storeinfo;
import com.hsys.tea.milktea.user.service.IndexService;

@Controller
public class IndexController {
	
	@Autowired
	private IndexService is; 
	
	@RequestMapping("/isCurrentCity")
	@ResponseBody
	public String isCurrentCity () {
		List<Storeinfo> findAllStoreinfos = is.findAllStoreinfos();
		
		return JSONArray.toJSONString(findAllStoreinfos);
	}
}

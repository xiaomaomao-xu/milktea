package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsys.tea.milktea.user.service.StoreService;

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	private StoreService ss;
	
	
}

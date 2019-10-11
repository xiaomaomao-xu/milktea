package com.hsys.tea.milktea.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hsys.tea.milktea.user.service.Impl.PayService;

@Controller
public class PayController {
	@Autowired
	private PayService ps;
	
	
}

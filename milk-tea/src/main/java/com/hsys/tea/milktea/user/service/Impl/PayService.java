package com.hsys.tea.milktea.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsys.tea.milktea.dao.CommoditymaterialMapper;
import com.hsys.tea.milktea.dao.OrderdetailinfoMapper;
import com.hsys.tea.milktea.dao.OrderinfoMapper;
import com.hsys.tea.milktea.dao.ShoppingbagDetailInfoMapper;
import com.hsys.tea.milktea.dao.ShoppingbagMapper;

@Service
public class PayService {
	@Autowired
	private CommoditymaterialMapper cmm;
	
	@Autowired
	private OrderinfoMapper oim;
	
	@Autowired
	private OrderdetailinfoMapper odim;
	
	@Autowired
	private ShoppingbagMapper sbm;
	
	@Autowired
	private ShoppingbagDetailInfoMapper sbdim;
	
	public String addOrderInfo() {
		
		return null;
	}
}

package com.hsys.tea.milktea.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsys.tea.milktea.dao.StoreinfoMapper;

@Service
public class StoreService {
	
	@Autowired
	private StoreinfoMapper sm;

	public String getDetailStoreinfo() {
		
		return null;
	}
}
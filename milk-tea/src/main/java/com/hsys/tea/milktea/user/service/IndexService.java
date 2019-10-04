package com.hsys.tea.milktea.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hsys.tea.milktea.dao.StoreinfoMapper;
import com.hsys.tea.milktea.entity.Storeinfo;

@Service
@Transactional
public class IndexService {
	
	@Autowired
	private StoreinfoMapper sm;
	
	public List<Storeinfo> findAllStoreinfos(){
		Storeinfo sf = new Storeinfo();
		return sm.findAllList(sf);
	}
	
	
	
}

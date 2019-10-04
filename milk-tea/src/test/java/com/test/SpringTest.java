package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hsys.tea.milktea.entity.Storeinfo;
import com.hsys.tea.milktea.user.service.IndexService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class SpringTest {
	@Autowired
	private IndexService is;
	
	@Test
	public void test1() {
		List<Storeinfo> findAllStoreinfos = is.findAllStoreinfos();
		for(Storeinfo si : findAllStoreinfos) {
			System.out.println(si.getBusinessHours());
		}
	}
}

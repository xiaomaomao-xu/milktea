package com.hsys.tea.milktea.comm.listener;

import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class LoginListener implements HttpSessionAttributeListener {
	
	/**
	 * 用户用来存储的常量
	 */
	private static ConcurrentHashMap<String,HttpSession> sessionMap = new  ConcurrentHashMap<String,HttpSession>();
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		HttpSession session = event.getSession();
		sessionMap.put(session.getId(),session);
		
		System.out.println("我先存起来了");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		
	}
}

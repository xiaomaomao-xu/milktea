package com.hsys.tea.milktea.comm.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.hsys.tea.milktea.wenxin.wxpay.ThreadUitl;

public class TheardServlet implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
//		Thread threaConfig = new Thread(new ThreadUitl());
//		threaConfig.start();
		System.out.println("我要初始化了");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}

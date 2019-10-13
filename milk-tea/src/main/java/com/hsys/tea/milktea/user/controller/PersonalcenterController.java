package com.hsys.tea.milktea.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsys.tea.milktea.entity.Userinfo;
import com.hsys.tea.milktea.user.service.IPersonalcenterService;

@Controller
public class PersonalcenterController {
	
	@Autowired
	private IPersonalcenterService iper;
	
	@Autowired
	public HttpSession session;
	
	//登陆
	@RequestMapping("/firstlogin")
	@ResponseBody
	public String firstlogin(HttpServletRequest req,Userinfo us) {
		
		System.out.println("getUserPhone"+us.getUserPhone()+"getUserAvatarUrl"+us.getUserAvatarUrl()+"openid:"+us.getOpenId()+"\nname:"+us.getUserName());
		
		Userinfo user=iper.login(us);
		System.out.println("useropenid:"+user.getOpenId()+"\nusername:"+user.getUserName());
//		req.getSession().getServletContext().setAttribute("user", user);
		session.setAttribute("openid", us.getOpenId());			
		return session.getId();
	}
	
	
		//修改用户
		@RequestMapping("/updateuser")
		@ResponseBody
		public String updateuser(HttpServletRequest req,Userinfo us) {
			
			Userinfo user = iper.querusr(us);
//			req.getSession().getServletContext().setAttribute("user", user);
			
			return iper.upuser(us);
			
		}

}

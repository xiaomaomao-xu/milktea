package com.hsys.tea.milktea.user.service.Impl;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.UserVipMapper;
import com.hsys.tea.milktea.dao.UserinfoMapper;
import com.hsys.tea.milktea.entity.UserVip;
import com.hsys.tea.milktea.entity.Userinfo;
import com.hsys.tea.milktea.user.service.IPersonalcenterService;

@Service
@Transactional
@Component
public class PersonalcenterService implements IPersonalcenterService {

	@Autowired
	public UserinfoMapper udao;

	@Autowired
	public UserVipMapper usevip;
	

	
	// 登陆
	@Override
	public Userinfo login(Userinfo us) {
		Userinfo ue = udao.querUser(us);
		System.out.println("wolaiguol sdfsdfsdf aa");
		if (ue != null) {
//			UserVip uv = usevip.queruservip(ue);
//			if (ue.getUserExp() != uv.getUserGoempirical()) {
//				us.setUserExp(uv.getUserGoempirical());
//				us.setUserGrabe(uv.getGrade());
//				try {
//					int c = udao.updateexp(uv);
//				} catch (Exception e) {
//				}
//			} else {
//			}
			System.out.println("wolaiguol  aa");
			return ue;
		} else {
			try {
				System.out.println("wolaiguol  sadfsadfsadf sdfasdfsadf zmhs");
				us.setCreateTime(new Date());
				us.setModifyTime(new Date());
				udao.firstlogin(us);
//				Userinfo ug = udao.querUser(us);
//				int vip = usevip.adduservip(ug);
				System.out.println("wolaiguol  zmhs");
				return us;
			} catch (Exception e) {
				// TODO: handle exception
				return us;
			}

		}

	}

	// 查询用户
	@Override
	public Userinfo querusr(Userinfo us) {
		return udao.querUser(us);
	}

	// 通过编号查用户

	// 修改用户
	@Override
	public String upuser(Userinfo us) {
		int a;
		try {
			udao.updatuser(us);
			return JSON.toJSONString(ConfigConstant.renewalwin);
		} catch (Exception e) {
			return JSON.toJSONString(ConfigConstant.renewalwin);
		}
	}

}

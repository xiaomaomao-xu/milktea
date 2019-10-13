package com.hsys.tea.milktea.dao;

import java.util.List;

import com.hsys.tea.milktea.entity.Taskcenter;
import com.hsys.tea.milktea.entity.UserVip;
import com.hsys.tea.milktea.entity.Userinfo;

public interface UserinfoMapper {
	Userinfo selectByOpenId(String openId);
	
	List<Userinfo> findAllList();
	
    int deleteByPrimaryKey(Integer userId);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    
  //添加用户
	public int firstlogin(Userinfo us);
	
	
	//用户查询openid
	public Userinfo querUser(Userinfo us);
	
	
	//用户修改
	public int  updatuser(Userinfo us);
	
	
	//钱包充值
	public int recharge(Userinfo us); 
	
	
	//支付密码修改
	public int updatepaymentcode(Userinfo us);
	
	
	//用户的经验等级修改
	public int updateexp(UserVip uv);
	
	
	//完成任务添加积分
	public int updateinterg(Userinfo us);
	
	
	//通过用户Id查询
	public Userinfo queruserbyid(Taskcenter ts);
}
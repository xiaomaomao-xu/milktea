package com.hsys.tea.milktea.dao;

import com.hsys.tea.milktea.entity.UserVip;
import com.hsys.tea.milktea.entity.Userinfo;

public interface UserVipMapper {
	int deleteByPrimaryKey(Integer vipId);

	int insert(UserVip record);

	int insertSelective(UserVip record);

	UserVip selectByPrimaryKey(Integer vipId);

	int updateByPrimaryKeySelective(UserVip record);

	int updateByPrimaryKey(UserVip record);

	// 首次登陆注册普通会员（添加会员）
	public int adduservip(Userinfo us);

	// 登陆查询会员
	public UserVip queruservip(Userinfo us);

	// 修改用户等级
	public int updateuservip(Userinfo us);

	// 添加经验值
	public int updateuserexe(UserVip uv);

	// 修改等级
	public int updategrade(UserVip uv);
}
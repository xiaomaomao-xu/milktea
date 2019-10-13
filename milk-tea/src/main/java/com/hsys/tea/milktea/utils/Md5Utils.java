package com.hsys.tea.milktea.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
/**
 * Md5加密算法
 * @author Administrator
 *
 */
public class Md5Utils {
	
	/**
	 * 线程安全的变量
	 */
	private static ThreadLocal<Md5Utils> local = new ThreadLocal<Md5Utils>();
	
	/**
	 * 工具类的私有构造方法
	 */
	private Md5Utils(){}
	
	/**
	 * 获取工具类实例
	 * @return
	 */
	public static synchronized Md5Utils getInstance(){
		Md5Utils instance = local.get();
		if (instance == null) {
			instance = new Md5Utils();
			local.set(instance);
		}
		return local.get();
	}
	
	public String md5(String password) {	
		try {
			//得到md5算法器
			MessageDigest md=MessageDigest.getInstance("MD5");
			byte[] bytes=Base64.getEncoder().encode(md.digest(password.getBytes()));
			String str=new String(bytes);
			return str;	
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
}

package com.hsys.tea.milktea.wenxin.wxpay;


/*
 * 需将此类配置成启动自启
 * 
 */
public class WxToken {
	public static void getToken() {
		ThreadUitl.appid=Config.Appid;
		ThreadUitl.appsecret=Config.AppSecret;
		new Thread(new ThreadUitl()).start();
	}
}

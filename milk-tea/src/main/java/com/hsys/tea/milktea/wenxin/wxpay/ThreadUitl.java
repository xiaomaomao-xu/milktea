package com.hsys.tea.milktea.wenxin.wxpay;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.alibaba.fastjson.JSONObject;

public class ThreadUitl implements Runnable {
	
	public static String appid="";
	public static String appsecret="";
	public static String access_token=null;
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		while(true){
//			access_token=http(appid,appsecret);
//			try {
//				if(access_token!=null){
//					Thread.sleep(7100*1000);
//				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		System.out.println("我要运行了");
		while(true){
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("我要运行了");
		}
		
		
	}
	public static String  http(String appid1, String appsecret1){
		String path="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid1+"&secret="+appsecret1;
		
		try {
			URL url = new URL(path);
			HttpURLConnection http=(HttpURLConnection) url.openConnection();
			http.setRequestMethod("GET");
			http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			
			InputStream ins = http.getInputStream();
			int size = ins.available();
			byte[] date=new byte[size];
			ins.read(date);
			ins.close();
			String message=new String(date);
			JSONObject jsonObject=JSONObject.parseObject(message);
			String access_token=jsonObject.getString("access_token");
			return access_token;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}

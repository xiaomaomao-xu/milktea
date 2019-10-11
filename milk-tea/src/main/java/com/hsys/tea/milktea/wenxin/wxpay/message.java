package com.hsys.tea.milktea.wenxin.wxpay;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import com.alibaba.fastjson.JSONObject;

public class message {
	/**
	 * 下单成功通知
	 * @param openid 用户表示
	 * @param amount 订单金额
	 * @param shop_Name 商品名称
	 * @param Take_food 取餐号
	 * @param storeName 店铺名称
	 * @param warm_prompt 温馨提示
	 * @return
	 */
     public static JSONObject messageSend1(String openid,String amount,String shop_Name,String Take_food,String storeName,String warm_prompt) {
    	 JSONObject keyword=new JSONObject();
	    	keyword.put("keyword1",amount);
	    	keyword.put("keyword2",shop_Name);
	    	keyword.put("keyword3",Take_food);
	    	keyword.put("keyword4",storeName);
	    	keyword.put("keyword5",warm_prompt);
    	 JSONObject data=new JSONObject();
    	 data.put("touser",openid);
    	 data.put("template_id","Gg0sscdcUlhjpk6UDJyWvCAHOl6NtvQ5LdfA_PQR-K4");
    	 data.put("form_id","FORMID");
    	 data.put("data", keyword);
    	 return http(data);
     }
     /**
      *取餐通知
      * @param openid 用户表示
      * @param Take_food 取餐号码
      * @param food_Stores 取餐门店
      * @param food_Place 取餐地点
      * @param products_details 餐品详情
      * @param warm_prompt 温馨提示
      * @return
      */
     public static JSONObject messageSend2(String openid,String Take_food,String food_Stores,String food_Place,String products_details,String warm_prompt) {
    	 JSONObject keyword=new JSONObject();
	    	keyword.put("keyword1",Take_food);
	    	keyword.put("keyword2",food_Stores);
	    	keyword.put("keyword3",food_Place);
	    	keyword.put("keyword4",products_details);
	    	keyword.put("keyword5",warm_prompt);
    	 JSONObject data=new JSONObject();
    	 data.put("touser",openid);
    	 data.put("template_id","Gg0sscdcUlhjpk6UDJyWvCAHOl6NtvQ5LdfA_PQR-K4");
    	 data.put("form_id","FORMID");
    	 data.put("data", keyword);
    	 data.put("emphasis_keyword", "keyword1.DATA");
    	 return http(data);
     }
     /**
      * 订单评价提醒
      * @param openid 用户表示
      * @param storeName 店铺名称
      * @param order_status 订单状态
      * @param shop_Name 商品名称
      * @param oderId  订单编号
      * @param order_Time 下单时间
      * @param warm_prompt 温馨提示
      * @return
      */
     public static JSONObject messageSend3(String openid,String storeName,String order_status,String shop_Name,String oderId,String order_Time,String warm_prompt) {
    	 JSONObject keyword=new JSONObject();
	    	keyword.put("keyword1",storeName);
	    	keyword.put("keyword2",order_status);
	    	keyword.put("keyword3",shop_Name);
	    	keyword.put("keyword4",oderId);
	    	keyword.put("keyword5",order_Time);
	    	keyword.put("keyword6",warm_prompt);
    	 JSONObject data=new JSONObject();
    	 data.put("touser",openid);
    	 data.put("template_id","Gg0sscdcUlhjpk6UDJyWvCAHOl6NtvQ5LdfA_PQR-K4");
    	 data.put("form_id","FORMID");
    	 data.put("data", keyword);
    	 return http(data);
     }
     public static JSONObject http(JSONObject data) {
    	 String path="https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send?access_token="+ThreadUitl.access_token;
  		
  		try {
  			URL url = new URL(path);
  			HttpURLConnection http=(HttpURLConnection) url.openConnection();
  			http.setRequestMethod("POST");
  			http.setDoInput(true);
  			http.setDoOutput(true);
  			http.setRequestProperty("Content-Type", "application/json");
  			http.connect();
  			OutputStream out = http.getOutputStream();
  			PrintWriter pw = new PrintWriter(out);
  			pw.print(data);
  			pw.flush();
  			out.flush();
  			pw.close();
  			out.close();
  			
  			InputStream ins = http.getInputStream();
  			int size = ins.available();
  			byte[] date=new byte[size];
  			ins.read(date);
  			ins.close();
  			String message=new String(date);
  			JSONObject jsonObject=JSONObject.parseObject(message);
  			return jsonObject;
  		} catch (MalformedURLException e) {
  			e.printStackTrace();
  		} catch (IOException e) {
  			e.printStackTrace();
  		}
 		return (JSONObject) new JSONObject().put("rse", "fault");
     }
}

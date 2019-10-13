package com.hsys.tea.milktea.printer;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


public class Api_java_demo {
		
		public static final String URL = "http://api.feieyun.cn/Api/Open/";//不需要修改
		
		public static final String USER = "1290446369@qq.com";//*必填*：账号名
		public static final String UKEY = "b4FfJjuya82vfg2b";//*必填*: 注册账号后生成的UKEY
		
		//添加打印机
		public static String addprinter(Print_xingx info){
			String snlist="";
			//info.getSnId()+"#"+info.getKey()+"#"+info.getRemark()+"#"
			if(!info.getSnId().equals("")) {
				snlist=info.getSnId();
			}
			if(!info.getKey().equals("")) {
				snlist=snlist+"#"+info.getKey();
			}
			if(!info.getRemark().equals("")) {
				snlist=snlist+"#"+info.getRemark();
			}
			if(!info.getCarnum().equals("")) {
				snlist=snlist+"#"+info.getCarnum();
			}
		   //通过POST请求，发送打印信息到服务器
			RequestConfig requestConfig = RequestConfig.custom()  
		            .setSocketTimeout(30000)//读取超时  
		            .setConnectTimeout(30000)//连接超时
		            .build();
			
			CloseableHttpClient httpClient = HttpClients.custom()
					 .setDefaultRequestConfig(requestConfig)
					 .build();	
			
		    HttpPost post = new HttpPost(URL);
	        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("user",USER));
			String STIME = String.valueOf(System.currentTimeMillis()/1000);
			nvps.add(new BasicNameValuePair("stime",STIME));
			nvps.add(new BasicNameValuePair("sig",signature(USER,UKEY,STIME)));
			nvps.add(new BasicNameValuePair("apiname","Open_printerAddlist"));//固定值,不需要修改
			nvps.add(new BasicNameValuePair("printerContent",snlist));
			
			CloseableHttpResponse response = null;
			String result = null;
	        try
	        {
	    	   post.setEntity(new UrlEncodedFormEntity(nvps,"utf-8"));
	    	   response = httpClient.execute(post);
	       	   int statecode = response.getStatusLine().getStatusCode();
	       	   if(statecode == 200){
		        	HttpEntity httpentity = response.getEntity(); 
		            if (httpentity != null){
		            	result = EntityUtils.toString(httpentity);
		            }
	           }
	       }
	       catch (Exception e)
	       {
	    	   e.printStackTrace();
	       }
	       finally{
	    	   try {
	    		   if(response!=null){
	    			   response.close();
	    		   }
	    	   } catch (IOException e) {
	    		   e.printStackTrace();
	    	   }
	    	   try {
	    		   post.abort();
	    	   } catch (Exception e) {
	    		   e.printStackTrace();
	    	   }
	    	   try {
	    		   httpClient.close();
	    	   } catch (IOException e) {
	    		   e.printStackTrace();
	    	   }
	       }
	       return result;
		  
		}
		
		/**
		 * 		
		 * @param sn
		 * @param orderId
		 * @param address
		 * @param phone
		 * @param date
		 * @param moneys
		 * @param remark
		 * @param list
		 * @return
		 */
		//打印订单
		public static String print(String sn /*打印机编号*/,String orderId,String address,String phone,String date,String moneys,String remark,List<order> list){
			//标签说明：
			//单标签: 
			//"<BR>"为换行,"<CUT>"为切刀指令(主动切纸,仅限切刀打印机使用才有效果)
			//"<LOGO>"为打印LOGO指令(前提是预先在机器内置LOGO图片),"<PLUGIN>"为钱箱或者外置音响指令
			//成对标签：
			//"<CB></CB>"为居中放大一倍,"<B></B>"为放大一倍,"<C></C>"为居中,<L></L>字体变高一倍
			//<W></W>字体变宽一倍,"<QR></QR>"为二维码,"<BOLD></BOLD>"为字体加粗,"<RIGHT></RIGHT>"为右对齐
			//拼凑订单内容时可参考如下格式
			//根据打印纸张的宽度，自行调整内容的格式，可参考下面的样例格式
			
			String content;
			content = "<CB>陆少爷的茶</CB><BR>";
			content += "名称　　　　　 单价  数量 金额<BR>";
			for(int i=0;i<list.size();i++) {
				content += "--------------------------------<BR>";
				content +=list.get(i).getShopname()+"<BR>";
				content +="                "+list.get(i).getPrice()+"    "+list.get(i).getNum()+"    "+list.get(i).getMoney()+"<BR>";
				content += "附加："+list.get(i).getRemark()+"<BR>";
			}
			content += "--------------------------------<BR>";
			content += "合计："+moneys+"元<BR>";
			content+="订单编号："+orderId+"<BR";
			if(!address.equals("")) {
				content += "送货地点："+address+"<BR>";
			}
			content += "联系电话："+phone+"<BR>";
			content += "订餐时间："+date+"<BR>";
			content += "备注："+remark+"<BR>";
			//content += "<QR>http://www.dzist.com</QR>";
			
		   //通过POST请求，发送打印信息到服务器
			RequestConfig requestConfig = RequestConfig.custom()  
		            .setSocketTimeout(30000)//读取超时  
		            .setConnectTimeout(30000)//连接超时
		            .build();
			
			CloseableHttpClient httpClient = HttpClients.custom()
					 .setDefaultRequestConfig(requestConfig)
					 .build();	
			
		    HttpPost post = new HttpPost(URL);
	        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("user",USER));
			String STIME = String.valueOf(System.currentTimeMillis()/1000);
			nvps.add(new BasicNameValuePair("stime",STIME));
			nvps.add(new BasicNameValuePair("sig",signature(USER,UKEY,STIME)));
			nvps.add(new BasicNameValuePair("apiname","Open_printMsg"));//固定值,不需要修改
			nvps.add(new BasicNameValuePair("sn",sn));
			nvps.add(new BasicNameValuePair("content",content));
			nvps.add(new BasicNameValuePair("times","1"));//打印联数
			
			CloseableHttpResponse response = null;
			String result = null;
	        try
	        {
	    	   post.setEntity(new UrlEncodedFormEntity(nvps,"utf-8"));
	    	   response = httpClient.execute(post);
	       	   int statecode = response.getStatusLine().getStatusCode();
	       	   if(statecode == 200){
		        	HttpEntity httpentity = response.getEntity(); 
		            if (httpentity != null){
		            	//服务器返回的JSON字符串，建议要当做日志记录起来
		            	result = EntityUtils.toString(httpentity);
		            }
	           }
	       }
	       catch (Exception e)
	       {
	    	   e.printStackTrace();
	       }
	       finally{
	    	   try {
	    		   if(response!=null){
	    			   response.close();
	    		   }
	    	   } catch (IOException e) {
	    		   e.printStackTrace();
	    	   }
	    	   try {
	    		   post.abort();
	    	   } catch (Exception e) {
	    		   e.printStackTrace();
	    	   }
	    	   try {
	    		   httpClient.close();
	    	   } catch (IOException e) {
	    		   e.printStackTrace();
	    	   }
	       }
	       return result;
		  
		}
		//标签打印机
		/**
		 * 
		 * @param sn
		 * @param number
		 * @param count
		 * @param prive
		 * @param date
		 * @param adjunction
		 * @param shopname
		 * @return
		 */
		public static String prints(String sn /*打印机编号*/,String number,String count,String prive,String date,String adjunction,String shopname){
			//标签说明：
			//单标签: 
			//"<BR>"为换行,"<CUT>"为切刀指令(主动切纸,仅限切刀打印机使用才有效果)
			//"<LOGO>"为打印LOGO指令(前提是预先在机器内置LOGO图片),"<PLUGIN>"为钱箱或者外置音响指令
			//成对标签：
			//"<CB></CB>"为居中放大一倍,"<B></B>"为放大一倍,"<C></C>"为居中,<L></L>字体变高一倍
			//<W></W>字体变宽一倍,"<QR></QR>"为二维码,"<BOLD></BOLD>"为字体加粗,"<RIGHT></RIGHT>"为右对齐
			//拼凑订单内容时可参考如下格式
			//根据打印纸张的宽度，自行调整内容的格式，可参考下面的样例格式
			
			String content = "";
			content += " <TEXT x=\"10\" y=\"20\" font=\"8\" w=\"1\" h=\"1\" r=\"0\">#"+number+"           "+count+"</TEXT>";
			content += " <TEXT x=\"10\" y=\"50\" font=\"12\" w=\"2\" h=\"2\" r=\"1\">"+shopname+"</TEXT>";
			for(int i=0;i<=(adjunction.length())/20;i++) {
				if(i==0) {
					if((adjunction.length())/20>0) {
						content += " <TEXT x=\"8\" y=\"100\" font=\"12\" w=\"1\" h=\"1\" r=\"0\">"+adjunction.substring(0,20)+"</TEXT>";
					}else {
						content += " <TEXT x=\"8\" y=\"100\" font=\"12\" w=\"1\" h=\"1\" r=\"0\">"+adjunction+"</TEXT>";
					}
				}else {
					if(i==(adjunction.length())/20) {
						content += " <TEXT x=\"8\" y=\""+(100+(i*30))+"\" font=\"12\" w=\"1\" h=\"1\" r=\"0\">"+adjunction.substring(i*20,adjunction.length())+"</TEXT>";
					}else {
						content += " <TEXT x=\"8\" y=\""+(100+(i*30))+"\" font=\"12\" w=\"1\" h=\"1\" r=\"0\">"+adjunction.substring(i*20,(i+1)*20)+"</TEXT>";
					}
				}
			
			}
			content += " <TEXT x=\"8\" y=\""+(100+((adjunction.length()/20)*30)+30)+"\" font=\"12\" w=\"1\" h=\"1\" r=\"0\">价格："+prive+"元</TEXT>";
			content += " <TEXT x=\"8\" y=\""+(100+((adjunction.length()/20)*30)+30+30)+"\" font=\"12\" w=\"1\" h=\"1\" r=\"0\">时间："+date+"</TEXT>";
		   //通过POST请求，发送打印信息到服务器
			RequestConfig requestConfig = RequestConfig.custom()  
		            .setSocketTimeout(30000)//读取超时  
		            .setConnectTimeout(30000)//连接超时
		            .build();
			
			CloseableHttpClient httpClient = HttpClients.custom()
					 .setDefaultRequestConfig(requestConfig)
					 .build();	
			
		    HttpPost post = new HttpPost(URL);
	        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("user",USER));
			String STIME = String.valueOf(System.currentTimeMillis()/1000);
			nvps.add(new BasicNameValuePair("stime",STIME));
			nvps.add(new BasicNameValuePair("sig",signature(USER,UKEY,STIME)));
			nvps.add(new BasicNameValuePair("apiname","Open_printLabelMsg"));//固定值,不需要修改
			nvps.add(new BasicNameValuePair("sn",sn));
			nvps.add(new BasicNameValuePair("content",content));
			nvps.add(new BasicNameValuePair("times","1"));//打印联数
			
			CloseableHttpResponse response = null;
			String result = null;
	        try
	        {
	    	   post.setEntity(new UrlEncodedFormEntity(nvps,"utf-8"));
	    	   response = httpClient.execute(post);
	       	   int statecode = response.getStatusLine().getStatusCode();
	       	   if(statecode == 200){
		        	HttpEntity httpentity = response.getEntity(); 
		            if (httpentity != null){
		            	//服务器返回的JSON字符串，建议要当做日志记录起来
		            	result = EntityUtils.toString(httpentity);
		            }
	           }
	       }
	       catch (Exception e)
	       {
	    	   e.printStackTrace();
	       }
	       finally{
	    	   try {
	    		   if(response!=null){
	    			   response.close();
	    		   }
	    	   } catch (IOException e) {
	    		   e.printStackTrace();
	    	   }
	    	   try {
	    		   post.abort();
	    	   } catch (Exception e) {
	    		   e.printStackTrace();
	    	   }
	    	   try {
	    		   httpClient.close();
	    	   } catch (IOException e) {
	    		   e.printStackTrace();
	    	   }
	       }
	       return result;
		  
		}

		
		//查询订单是否打印成功
		public static String queryOrderState(String orderid){
		
		   //通过POST请求，发送打印信息到服务器
			RequestConfig requestConfig = RequestConfig.custom()  
		            .setSocketTimeout(30000)//读取超时  
		            .setConnectTimeout(30000)//连接超时
		            .build();
			
			CloseableHttpClient httpClient = HttpClients.custom()
					 .setDefaultRequestConfig(requestConfig)
					 .build();	
			
		    HttpPost post = new HttpPost(URL);
	        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("user",USER));
			String STIME = String.valueOf(System.currentTimeMillis()/1000);
			nvps.add(new BasicNameValuePair("stime",STIME));
			nvps.add(new BasicNameValuePair("sig",signature(USER,UKEY,STIME)));
			nvps.add(new BasicNameValuePair("apiname","Open_queryOrderState"));//固定值,不需要修改
			nvps.add(new BasicNameValuePair("orderid",orderid));
			
			CloseableHttpResponse response = null;
			String result = null;
	        try
	        {
	    	   post.setEntity(new UrlEncodedFormEntity(nvps,"utf-8"));
	       	   response = httpClient.execute(post);
	       	   int statecode = response.getStatusLine().getStatusCode();
	       	   if(statecode == 200){
		        	HttpEntity httpentity = response.getEntity(); 
		            if (httpentity != null){
		            	//服务器返回
		            	result = EntityUtils.toString(httpentity);
		            }
	           }
	       }
	       catch (Exception e)
	       {
	    	   e.printStackTrace();
	       }
	        finally{
		    	   try {
		    		   if(response!=null){
		    			   response.close();
		    		   }
		    	   } catch (IOException e) {
		    		   e.printStackTrace();
		    	   }
		    	   try {
		    		   post.abort();
		    	   } catch (Exception e) {
		    		   e.printStackTrace();
		    	   }
		    	   try {
		    		   httpClient.close();
		    	   } catch (IOException e) {
		    		   e.printStackTrace();
		    	   }
		       }
	       return result;
	  
	   }

		
		
		//查询指定打印机某天的订单详情
		public static String queryOrderInfoByDate(String sn/*打印机编号*/,String strdate/*时间--yyyy-MM-ss*/){
		
		    //通过POST请求，发送打印信息到服务器
			RequestConfig requestConfig = RequestConfig.custom()  
		            .setSocketTimeout(30000)//读取超时  
		            .setConnectTimeout(30000)//连接超时
		            .build();
			
			CloseableHttpClient httpClient = HttpClients.custom()
					 .setDefaultRequestConfig(requestConfig)
					 .build();	
			
		    HttpPost post = new HttpPost(URL);
	        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("user",USER));
			String STIME = String.valueOf(System.currentTimeMillis()/1000);
			nvps.add(new BasicNameValuePair("stime",STIME));
			nvps.add(new BasicNameValuePair("sig",signature(USER,UKEY,STIME)));
			nvps.add(new BasicNameValuePair("apiname","Open_queryOrderInfoByDate"));//固定值,不需要修改
			nvps.add(new BasicNameValuePair("sn",sn));
			nvps.add(new BasicNameValuePair("date",strdate));//yyyy-MM-dd格式
			
			CloseableHttpResponse response = null;
			String result = null;
	        try
	        {
	    	   post.setEntity(new UrlEncodedFormEntity(nvps,"utf-8"));
	       	   response = httpClient.execute(post);
	       	   int statecode = response.getStatusLine().getStatusCode();
	       	   if(statecode == 200){
		        	HttpEntity httpentity = response.getEntity(); 
		            if (httpentity != null){
		            	//服务器返回
		            	result = EntityUtils.toString(httpentity);
		            }
	           }
	       }
	       catch (Exception e)
	       {
	    	   e.printStackTrace();
	       }
	        finally{
		    	   try {
		    		   if(response!=null){
		    			   response.close();
		    		   }
		    	   } catch (IOException e) {
		    		   e.printStackTrace();
		    	   }
		    	   try {
		    		   post.abort();
		    	   } catch (Exception e) {
		    		   e.printStackTrace();
		    	   }
		    	   try {
		    		   httpClient.close();
		    	   } catch (IOException e) {
		    		   e.printStackTrace();
		    	   }
		       }
	       return result;
	  
	   }
		
		
		
		//查询打印机的状态
		public static String queryPrinterStatus(String sn/*打印机编号*/){
		
		    //通过POST请求，发送打印信息到服务器
			RequestConfig requestConfig = RequestConfig.custom()  
		            .setSocketTimeout(30000)//读取超时  
		            .setConnectTimeout(30000)//连接超时
		            .build();
			
			CloseableHttpClient httpClient = HttpClients.custom()
					 .setDefaultRequestConfig(requestConfig)
					 .build();	
			
		    HttpPost post = new HttpPost(URL);
	        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("user",USER));
			String STIME = String.valueOf(System.currentTimeMillis()/1000);
			nvps.add(new BasicNameValuePair("stime",STIME));
			nvps.add(new BasicNameValuePair("sig",signature(USER,UKEY,STIME)));
			nvps.add(new BasicNameValuePair("apiname","Open_queryPrinterStatus"));//固定值,不需要修改
			nvps.add(new BasicNameValuePair("sn",sn));
			
			CloseableHttpResponse response = null;
			String result = null;
	        try
	        {
	    	   post.setEntity(new UrlEncodedFormEntity(nvps,"utf-8"));
	       	   response = httpClient.execute(post);
	       	   int statecode = response.getStatusLine().getStatusCode();
	       	   if(statecode == 200){
		        	HttpEntity httpentity = response.getEntity(); 
		            if (httpentity != null){
		            	//服务器返回
		            	result = EntityUtils.toString(httpentity);
		            }
	           }
	       }
	       catch (Exception e)
	       {
	    	   e.printStackTrace();
	       }
	        finally{
		    	   try {
		    		   if(response!=null){
		    			   response.close();
		    		   }
		    	   } catch (IOException e) {
		    		   e.printStackTrace();
		    	   }
		    	   try {
		    		   post.abort();
		    	   } catch (Exception e) {
		    		   e.printStackTrace();
		    	   }
		    	   try {
		    		   httpClient.close();
		    	   } catch (IOException e) {
		    		   e.printStackTrace();
		    	   }
		       }
	       return result;
	  
	   }
		
		
		//删除打印机
		public static String Open_printerDelList(String snlist/*打印机编号，批量用"-"减号分隔*/){
				
		//通过POST请求，发送打印信息到服务器
					RequestConfig requestConfig = RequestConfig.custom()  
				            .setSocketTimeout(30000)//读取超时  
				            .setConnectTimeout(30000)//连接超时
				            .build();
					
					CloseableHttpClient httpClient = HttpClients.custom()
							 .setDefaultRequestConfig(requestConfig)
							 .build();	
					
				    HttpPost post = new HttpPost(URL);
			        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
					nvps.add(new BasicNameValuePair("user",USER));
					String STIME = String.valueOf(System.currentTimeMillis()/1000);
					nvps.add(new BasicNameValuePair("stime",STIME));
					nvps.add(new BasicNameValuePair("sig",signature(USER,UKEY,STIME)));
					nvps.add(new BasicNameValuePair("apiname","Open_queryPrinterStatus"));//固定值,不需要修改
					nvps.add(new BasicNameValuePair("snlist",snlist));
					
					CloseableHttpResponse response = null;
					String result = null;
			        try
			        {
			    	   post.setEntity(new UrlEncodedFormEntity(nvps,"utf-8"));
			       	   response = httpClient.execute(post);
			       	   int statecode = response.getStatusLine().getStatusCode();
			       	   if(statecode == 200){
				        	HttpEntity httpentity = response.getEntity(); 
				            if (httpentity != null){
				            	//服务器返回
				            	result = EntityUtils.toString(httpentity);
				            }
			           }
			       }
			       catch (Exception e)
			       {
			    	   e.printStackTrace();
			       }
			        finally{
				    	   try {
				    		   if(response!=null){
				    			   response.close();
				    		   }
				    	   } catch (IOException e) {
				    		   e.printStackTrace();
				    	   }
				    	   try {
				    		   post.abort();
				    	   } catch (Exception e) {
				    		   e.printStackTrace();
				    	   }
				    	   try {
				    		   httpClient.close();
				    	   } catch (IOException e) {
				    		   e.printStackTrace();
				    	   }
				       }
			       return result;
			  
			   }
		
		//生成签名字符串
		public static String signature(String USER,String UKEY,String STIME){
			String s = DigestUtils.shaHex(USER+UKEY+STIME);
			return s;
		}
		
	
}

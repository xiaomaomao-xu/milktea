package com.hsys.tea.milktea.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

public class FileBizUtils {
	
	/**
	 * 线程安全的变量
	 */
	private static ThreadLocal<FileBizUtils> local = new ThreadLocal<FileBizUtils>();
	
	/**
	 * 工具类的私有构造方法
	 */
	private FileBizUtils(){}
	
	/**
	 * 获取工具类实例
	 * @return
	 */
	public static synchronized FileBizUtils getInstance(){
		FileBizUtils instance = local.get();
		if (instance == null) {
			instance = new FileBizUtils();
			local.set(instance);
		}
		return local.get();
	}
	
	public HashMap<String, String> upload(HttpServletRequest req,String uploadPath) {  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");  
        File tmpDir = new File("c://temp"); 
        HashMap<String, String> map=new HashMap<String, String>();
        String diz="";
        try {  
            if (ServletFileUpload.isMultipartContent(req)) {  
                DiskFileItemFactory factory = new DiskFileItemFactory();  
                factory.setSizeThreshold(1 * 1024 * 1024);   
                factory.setRepository(tmpDir);   
                ServletFileUpload sfu = new ServletFileUpload(factory); 
                sfu.setFileSizeMax(5 * 1024 * 1024);  
                sfu.setSizeMax(10 * 1024 * 1024);   
                sfu.setHeaderEncoding("UTF-8");
                List<FileItem> list = sfu.parseRequest(req);
                uploadPath = uploadPath + "imager//";
                if (!new File(uploadPath).isDirectory()){  
                    new File(uploadPath).mkdirs();
                }  
                int index = 0;  
                for(FileItem item:list){
                	if(item.isFormField()){
                		String name = item.getFieldName();
                		String value = item.getString("UTF-8");
                		map.put(name,value);
                	}else{
                		if(item.getName()==null||"".equals(item.getName().trim())){
                			diz="";
                			map.put("imger",diz);
                			continue;
                		}
                		  String fileName = item.getName().substring(item.getName().lastIndexOf("."));  
                          fileName = sdf.format(new Date())+"-"+index+fileName;  
                          BufferedInputStream in = new BufferedInputStream(item.getInputStream());   
                          BufferedOutputStream out = new BufferedOutputStream(  
                                  new FileOutputStream(new File(uploadPath + "" + fileName)));  
                          diz="imager/"+fileName;
                          map.put("imger",diz);
                          Streams.copy(in, out, true); 
                          index++;  
                          
                	}
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }
		return map ;
    }  
}

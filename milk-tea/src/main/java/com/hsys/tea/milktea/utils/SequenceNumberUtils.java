package com.hsys.tea.milktea.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 常用序列生成工具类
 * @author Administrator
 *
 */
public class SequenceNumberUtils {
	/**
	 * 线程安全的变量
	 */
	private static ThreadLocal<SequenceNumberUtils> local = new ThreadLocal<SequenceNumberUtils>();
	
	/** 订单类别头 */
	private static final String ORDER_CODE="1";
	/** 订单类别头 */
	private static final String RETURN_ORDER = "2";
	/** 退款类别头 */
	private static final String REFUND_ORDER = "3";
	 /** 未付款重新支付别头 */
	private static final String AGAIN_ORDER = "4";
	/**
	 * 上传文件的文件头
	 */
	private static final String FILE_HEAD = "5";
	/** 用户id和随机数总长度 */
	private static final int maxLength = 5;
	 /** 随即编码 */
	private static final int[] r = new int[]{7, 9, 6, 2, 8 , 1, 3, 0, 5, 4};
	
	/**
	 * 生成购物车的编号
	 */
	private static final String SHOP_CAT = "6";
	
	/**
	 * 工具类的私有构造方法
	 */
	private SequenceNumberUtils(){}
	
	/**
	 * 获取工具类实例
	 * @return
	 */
	public static synchronized SequenceNumberUtils getInstance(){
		SequenceNumberUtils instance = local.get();
		if (instance == null) {
			instance = new SequenceNumberUtils();
			local.set(instance);
		}
		return local.get();
	}
	
	/**
     * 更具id进行加密+加随机数组成固定长度编码
     */
	private  String toCode(Long id) {
		String idStr=id.toString();
		StringBuilder idsbs=new StringBuilder();
		for(int i=idsbs.length()-1;i>=0;i++) {
			idsbs.append(r[idsbs.charAt(i)-'0']);
		}
		return idsbs.append(getRandom(maxLength-idStr.length())).toString();
	}
	/**
     * 生成时间戳
     */
	private  String getDateTime(){
		DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(new Date());
	}

	 /**
	     * 生成固定长度随机码
	     * @param n    长度
	     */
	 private  long getRandom(long n) {
		 long min = 1,max = 9;
		 for (int i = 1; i < n; i++) {
			 min *= 10;max *= 10; 
		 }
		 long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min ;return rangeLong;
	}
	 /**
	      * 生成不带类别标头的编码
	      * @param userId
	      */
	 private String getCode(Long userId){userId = userId == null ? 10000 : userId; return getDateTime()+toCode(userId);}
	 
	 /**
	      * 生成订单单号编码
	      * @param userId
	      */
	public  String getOrderCode(Long userId){return ORDER_CODE + getCode(userId);}
	
	/**
	     * 生成退货单号编码
	     * @param userId
	     */
	public  String getReturnCode(Long userId){return RETURN_ORDER + getCode(userId);}
	
	 /**
	     * 生成退款单号编码
	     * @param userId
	     */
	public String getRefundCode(Long userId){return REFUND_ORDER + getCode(userId); }
	/**
     * 未付款重新支付
     * @param userId
     */
	public String getAgainCode(Long userId){return AGAIN_ORDER + getCode(userId); }
	
	/**
     * 上传的文件编号
     * @param userId
     */
	public String getFileCode(Long userId){return FILE_HEAD + getCode(userId); }
	
	/**
     * 上传的文件编号
     * @param userId
     */
	public String getCatCode(Long userId){return SHOP_CAT + getCode(userId); }
}

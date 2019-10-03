package com.hsys.tea.milktea.constant;

/**
 * 系统常用常量
 * @author Administrator
 *
 */
public class ConfigConstant {
	/**
	 * 营业状态
	 */
	public static final int operationState = 0;
	
	/**
	 * 歇业状态
	 */
	public static final int unOperationState = 1;
	
	/**
	 * 配送
	 */
	public static final int isDelivery = 0;
	
	/**
	 * 不配送
	 */
	public static final int isNotDelivery = 1;
	
	/**
	 * 商品上架
	 */
	public static final int offeringSoldOn = 0;
	
	/**
	 * 商品下架
	 */
	public static final int offeringSoldOut = 1;
	
	/**
	 * 商品已售完
	 */
	public static final int offeringSellOut = 2;
	
	/**
	 * 订单创建状态
	 */
	public static final int createOrderState = 0;
	
	/**
	 * 订单完成状态
	 */
	public static final int completeOrderState = 1;
	
	/**
	 * 自己去取
	 */
	public static final int selfToTake = 0;
	
	/**
	 * 店铺外送
	 */
	public static final int holdOut = 1;
	
	/**
	 * 正在进行外送
	 */
	public static final int sending = 0;
	
	/**
	 * 外送成功
	 */
	public static final int sendSuccess = 1;
	
	/**
	 * 喜茶卷未使用
	 */
	public static final int couponUnUsed = 0;
	
	/**
	 * 喜茶卷已使用
	 */
	public static final int couponUsed = 1;
	
	/**
	 * 喜茶卷已过期
	 */
	public static final int couponOutOfDate = 2;
	
	/**
	 * 星球会员正在使用
	 */
	public static final int starVipUsed = 0;
	
	/**
	 * 星球会员已失效
	 */
	public static final int starVipInvalid = 1;
	
	/**
	 * 是代金卷
	 */
	public static final int isVoucher = 0;
	
	/**
	 * 不是代金卷
	 */
	public static final int isNotVoucher = 1;
	
	/**
	 * 支付方式为钱包
	 */
	public static final int walletPayment = 0;
	
	/**
	 * 支付方式为微信
	 */
	public static final int weChatPayment = 1;
	
	/**
	 * 任务未完成
	 */
	public static final int taskUnFinished = 0;
	
	/**
	 * 任务未领取
	 */
	public static final int taskUnReceived = 1;
	
	/**
	 * 任务已领取
	 */
	public static final int taskReceived = 2;
	
	/**
	 * 线程池的数量
	 */
	public static final int threadNum = 20;
}

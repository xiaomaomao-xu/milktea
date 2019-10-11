package com.hsys.tea.milktea.wenxin.wxpay;


import java.util.HashMap;
import java.util.Map;

import com.hsys.tea.milktea.wenxin.wxutils.MyConfig;
import com.hsys.tea.milktea.wenxin.wxutils.WXPay;

public class Wxpay {

	/**
     * 统一下单
     *
     * @param out_trade_no 订单编号
     * @param body 商品描述
     * @param total_fee 商品价格
     * @param openid 用户表示
     * @param spbill_create_ip IP
     * @param notify_url 成功后返回地址
     * @return 统一下单
     */
	public Map<String, String> wxpay(String out_trade_no,String body,String total_fee,String openid,String spbill_create_ip,String notify_url) throws Exception {
		MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("out_trade_no", out_trade_no);
        data.put("body",body);
        data.put("fee_type", "CNY");
        data.put("total_fee",total_fee);
        data.put("spbill_create_ip",spbill_create_ip);
        data.put("trade_type", "JSAPI");  // 此处指定为扫码支付
        data.put("notify_url",notify_url);
        data.put("openid", openid);
        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            return resp;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
		
	}
	/**
	 * 退款
	 * 
	 * @param out_trade_no //订单编号
	 * @param out_refund_no //退款编号
	 * @param total_fee //订单金额
	 * @param refund_fee //退款金额
	 * @param notify_url //退款成功通知地址
	 * @return
	 * @throws Exception
	 */
	public Map<String,String>wxrefund(String out_trade_no,String out_refund_no,String total_fee,String refund_fee,String notify_url) throws Exception{//
		MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("out_trade_no", out_trade_no);
        data.put("out_refund_no", out_refund_no);
        data.put("refund_fee_type", "CNY");
        data.put("total_fee",total_fee);
        data.put("refund_fee",refund_fee);
        data.put("notify_url",notify_url);
        try {
            Map<String, String> resp = wxpay.refund(data);
            return resp;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
	/**
	 * 
	 * @param partner_trade_no 提现编号
	 * @param openid 用户表示
	 * @param amount 提现金额
	 * @param spbill_create_ip Ip地址
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> deposit(String partner_trade_no,String openid,String amount,String spbill_create_ip) throws Exception {
		MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("partner_trade_no", partner_trade_no);
        data.put("openid", openid);
        data.put("check_name", "NO_CHECK");
        data.put("amount",amount);
        data.put("desc","退款");
        data.put("spbill_create_ip",spbill_create_ip);
        Map<String, String> resp=new HashMap<String, String>();
        try {
        	resp = wxpay.deposit(data);
            return resp;
        } catch (Exception e) {
           
        }
		return null;
	}
}

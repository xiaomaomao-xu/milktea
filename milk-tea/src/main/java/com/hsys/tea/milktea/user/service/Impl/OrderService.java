package com.hsys.tea.milktea.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.OrderdetailinfoMapper;
import com.hsys.tea.milktea.dao.OrderinfoMapper;
import com.hsys.tea.milktea.entity.Orderdetailinfo;
import com.hsys.tea.milktea.entity.Orderinfo;
import com.hsys.tea.milktea.utils.SequenceNumberUtils;
@Service
public class OrderService {
	@Autowired
	private OrderinfoMapper om;
	
	@Autowired
	private OrderdetailinfoMapper odm;
	
	@Transactional
	public String insertCurrentUserOrder(Orderinfo orderinfo) {
		orderinfo.setOrderId(new Long(SequenceNumberUtils.getInstance().getOrderCode(new Long(orderinfo.getOrderId()))));
		int responseOrder = om.insert(orderinfo);
		System.out.println(orderinfo.getOrderId());
		if(responseOrder>0) {
			int addValue = 0;
			for(Orderdetailinfo odl : orderinfo.getOrderdetailinfos()) {
				addValue++;
				odl.setOrderDetailId((orderinfo.getOrderId()+addValue));
				odl.setOrderId(orderinfo.getOrderId());
			}
		}else {
			return ConfigConstant.renewalfaling;
		}
		int batchResponse = odm.insertByBatch(orderinfo.getOrderdetailinfos());
		if(batchResponse > 0) {
			return ConfigConstant.renewalwin;
		}
		return ConfigConstant.renewalfaling;
	}
	
	public String getOrderinfo(Orderinfo orderinfo) {
		return JSONObject.toJSONString(om.selectOrderinfo(orderinfo));
	}
	
	public String getDetailOrderinfo(Orderinfo orderinfo) {
		return JSONObject.toJSONString(om.selectDeatilOrderinfo(orderinfo));
		
	}
	
	
}

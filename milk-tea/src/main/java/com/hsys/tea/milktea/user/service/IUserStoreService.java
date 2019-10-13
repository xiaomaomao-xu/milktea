package com.hsys.tea.milktea.user.service;

import com.hsys.tea.milktea.entity.Commodityinfo;
import com.hsys.tea.milktea.entity.Storeinfo;

public interface IUserStoreService {

	/**
	 * 获取店铺的详细信息
	 * @param store
	 * @return
	 */
	String getDetailStoreinfo(Storeinfo store);
	
	/**
	 * 获取店铺商品的详细信息
	 * @param commodityinfo
	 * @return
	 */
	String getDetailCommodityinfo(Commodityinfo commodityinfo);
	
}

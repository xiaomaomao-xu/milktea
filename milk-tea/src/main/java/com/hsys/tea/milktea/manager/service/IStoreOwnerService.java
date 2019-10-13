package com.hsys.tea.milktea.manager.service;

import com.hsys.tea.milktea.entity.Shopkeeperinfo;

public interface IStoreOwnerService {
	
	/**
	 * 获取店铺持有人的信息
	 * @param ownerInfo
	 * @return
	 */
	String getStoreOwnerInfo(Shopkeeperinfo ownerInfo);
	
	/**
	 * 保存店铺持有人的信息
	 * @param ownerInfo
	 * @return
	 */
	String savaStoreOwnerInfo(Shopkeeperinfo ownerInfo);
	
	/**
	 * 删除店铺持有人的信息
	 * @param ownerInfo
	 * @return
	 */
	String deleteStoreOwnerInfo(Shopkeeperinfo ownerInfo);
}

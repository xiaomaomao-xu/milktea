package com.hsys.tea.milktea.manager.service;

import com.hsys.tea.milktea.entity.Storeinfo;

public interface IStoreService {
	
	/**
	 * 获取所有的店铺
	 * @return
	 */
	String getAllStore();
	
	/**
	 * 获取店铺的信息
	 * @param store
	 * @return
	 */
	String getStore(Storeinfo store);
	
	/**
	 * 保存店铺的信息
	 * @param store
	 * @return
	 */
	String saveStore(Storeinfo store);
	
	/**
	 * 删除店铺
	 * @param store
	 * @return
	 */
	String deleteStore(Storeinfo store);
}

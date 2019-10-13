package com.hsys.tea.milktea.user.service.Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hsys.tea.milktea.dao.StoreinfoMapper;
import com.hsys.tea.milktea.entity.Storeinfo;
import com.hsys.tea.milktea.user.service.IAddressService;
import com.hsys.tea.milktea.utils.CalculationDistanceUtils;

@Service
public class AddressService implements IAddressService{
	
	@Autowired
	private StoreinfoMapper sm;
	
	/**
	 * 获取地址选择列表
	 * @return
	 */
	@Override
	public String getAllAddress() {
		List<Storeinfo> findAllLists = sm.findAllList();
		Map<String, List<String>> addressMap = new HashMap<String, List<String>>();
		Iterator<Storeinfo> StoreinfoIterator = findAllLists.iterator();
		while(StoreinfoIterator.hasNext()) {
			Storeinfo storeinfo = StoreinfoIterator.next();
			String storeAddress = storeinfo.getStoreAddress();
			String[] targetStrings = storeAddress.split("-");
			if (addressMap.containsKey(targetStrings[0])) {
				List<String> list = addressMap.get(targetStrings[0]);
				if (!list.contains(targetStrings[1])) {
					list.add(targetStrings[1]);
				}
			}else {
				List<String> list = new ArrayList<String>();
				list.add (targetStrings[1]);
				addressMap.put(targetStrings[0], list);
			}
		}
		return JSON.toJSONString(addressMap);
	}
	
	private String getStoreinfos(String Address, String longitude, String latitude) {
		if (Address == null) {
			return null;
		}
		List<Storeinfo> findAllLists = sm.findAllList();
		List<Storeinfo> findCurrentLists = new ArrayList<Storeinfo>();
		for (Storeinfo ssf : findAllLists) {
			String storeAddress = ssf.getStoreAddress();
			String splitString = splitString(storeAddress);
			if (Address.equals(splitString)) {
				ssf.setDistance(CalculationDistanceUtils.getInstance()
						.getDistance(latitude, longitude, ssf.getLatitude(), ssf.getLongitude()));
				findCurrentLists.add(ssf);
			}
		}
		if (findCurrentLists.size() > 0) {
			Collections.sort(findCurrentLists, new Comparator<Storeinfo>() {
				@Override
				public int compare(Storeinfo o1, Storeinfo o2) {
					return o1.getDistance().compareTo(o2.getDistance());
				}
			});
			return JSONArray.toJSONString(findCurrentLists);
		}
		return null;
	}
	
	/**
	 * 判断用户当前所在的城市里面有没有相应的门店
	 */
	@Override
	public String getSelectCityStoreinfos(String userAddress, String longitude, String latitude){
		return getStoreinfos(userAddress, longitude, latitude);
	}
	
	@Override
	public String getdefaultCityStoreinfos(String longitude, String latitude) {
		List<Storeinfo> findAllList = sm.findAllList();
		if(findAllList == null || findAllList.size() == 0) {
			return null;
		}
		String storeAddress = findAllList.get(0).getStoreAddress();
		String splitString = splitString(storeAddress);
		return getStoreinfos(splitString, longitude, latitude);
	}
	
	/**
	 * 分离地址信息
	 * @param resourceString
	 * @return
	 */
	private String splitString(String resourceString) {
		String[] targetStrings = resourceString.split("-");
		if (targetStrings == null || targetStrings.length == 0) {
			return null;
		}
		return targetStrings[0];
	}
}

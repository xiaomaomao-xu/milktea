package com.hsys.tea.milktea.user.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hsys.tea.milktea.constant.ConfigConstant;
import com.hsys.tea.milktea.dao.StoreinfoMapper;
import com.hsys.tea.milktea.entity.Storeinfo;

@Service
@Transactional
public class AddressService {
	
	@Autowired
	private StoreinfoMapper sm;
	
	/**
	 * 获取地址选择列表
	 * @return
	 */
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
				ssf.setDistance(getDistance(latitude, longitude, 
						ssf.getLatitude(), ssf.getLongitude()));
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
	public String getCurrentCityStoreinfos(String userAddress, String longitude, String latitude){
		return getStoreinfos(userAddress, longitude, latitude);
	}
	
	public String getdefaultCityStoreinfos(String longitude, String latitude) {
		return getStoreinfos(ConfigConstant.defaultAddress, longitude, latitude);
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
	
	/**
     * 根据两个位置的经纬度，来计算两地的距离（单位为KM）
     * 参数为String类型
     * @param lat1 用户经度
     * @param lng1 用户纬度
     * @param lat2 商家经度
     * @param lng2 商家纬度
     * @return
     */
    private static String getDistance(String lat1Str, String lng1Str, String lat2Str, String lng2Str) {
    	double EARTH_RADIUS = 6378.137;
    	Double lat1 = Double.parseDouble(lat1Str);
        Double lng1 = Double.parseDouble(lng1Str);
        Double lat2 = Double.parseDouble(lat2Str);
        Double lng2 = Double.parseDouble(lng2Str);

        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double difference = radLat1 - radLat2;
        double mdifference = rad(lng1) - rad(lng2);
        double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(difference / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(mdifference / 2), 2)));
        distance = distance * EARTH_RADIUS;
        distance = Math.round(distance * 10000) / 10000;
        String distanceStr = distance+"";
        distanceStr = distanceStr.
                substring(0, distanceStr.indexOf("."));

        return distanceStr;
    }
    
    /**
     * 计算弧度
     * @param d
     * @return
     */
    private static double rad(double d)
    {
        return d * Math.PI / 180.0;
    }
}

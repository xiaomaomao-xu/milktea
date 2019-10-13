package com.hsys.tea.milktea.user.service;

public interface IAddressService {
	String getAllAddress();
	String getSelectCityStoreinfos(String userAddress, String longitude, String latitude);
	String getdefaultCityStoreinfos(String longitude, String latitude) ;
}

package com.hsys.tea.milktea.user.service;

import com.hsys.tea.milktea.entity.Shoppingbag;

public interface IShoppingBagService {

	String findCurrentUserBag(Shoppingbag shoppingbag);

	String saveCurrentUserBag(Shoppingbag shoppingbag);

}

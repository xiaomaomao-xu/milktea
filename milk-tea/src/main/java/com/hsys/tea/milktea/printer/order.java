package com.hsys.tea.milktea.printer;



public class order {
	public String shopname;
	
	public String price;
	
	public String num;
	
	public String money;
	
	public String remark;

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	

	public order(String shopname, String price, String num, String money, String remark) {
		super();
		this.shopname = shopname;
		this.price = price;
		this.num = num;
		this.money = money;
		this.remark = remark;
	}

	public order() {
		super();
	}
	
}

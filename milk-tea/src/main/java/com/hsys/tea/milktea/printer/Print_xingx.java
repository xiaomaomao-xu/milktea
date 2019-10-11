package com.hsys.tea.milktea.printer;



public class Print_xingx {
	public String snId;//打印机编号
	public String key;//打印机标识码
	public String remark;//备注名称
	public String carnum;//流量卡编号
	
	
	public String getSnId() {
		return snId;
	}


	public void setSnId(String snId) {
		this.snId = snId;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getCarnum() {
		return carnum;
	}


	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	
	

	public Print_xingx(String snId, String key, String remark, String carnum) {
		super();
		this.snId = snId;
		this.key = key;
		this.remark = remark;
		this.carnum = carnum;
	}


	public Print_xingx() {
		super();
	}
	
}

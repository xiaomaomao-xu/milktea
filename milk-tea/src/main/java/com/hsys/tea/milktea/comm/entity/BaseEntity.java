package com.hsys.tea.milktea.comm.entity;

public class BaseEntity {
	/**
	 * 用来标识是新建还是更新
	 */
	protected Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		
	}
	
	public BaseEntity(Integer id) {
		this.id = id;
	}
	
}

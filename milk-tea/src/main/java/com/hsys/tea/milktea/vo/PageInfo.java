package com.hsys.tea.milktea.vo;

import java.io.Serializable;
import java.util.List;


public class PageInfo<T> implements Serializable{
	private static final long serialVersionUID = 1L;  
    //当前页  
    private int pageNum;
    //每页的数量  
    private int pageSize;
    //总页数  
    private int pages;
    //结果集  
    private List<T> list;  
  
  
    public PageInfo() {  
    }  
  
    /** 
     * 包装Page对象 
     * 
     * @param list 
     */  
    public PageInfo(List<T> list) {  
        this(list, 8);  
    }  
  
    /** 
     * 包装Page对象 
     * 
     * @param list          page结果 
     * @param navigatePages 页码数量 
     */  
    public PageInfo(List<T> list, int navigatePages) {  
    	this.list = list;
    	this.pageSize = navigatePages;
    }

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
    
}

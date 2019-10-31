package com.ordersys.util;

import java.util.List;

/**
 * 分页的工具类，封装了分页需要的数据
 * 
 * @author 向仕懿 当前页码，每页大小，总记录数，总页数，当前页数据
 * @param <T>
 */
public class PageUtil<T> {
	/**
	 * 当前页码
	 */
	private int pageIndex;

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	/**
	 * 每页大小
	 */
	private int pageSize;

	/**
	 * 总记录数
	 */
	private int rowCount;

	/**
	 * 总页数
	 */
	private int pageNumber;
	/**
	 * 当前页的数据
	 */
	public List<T> list;
}

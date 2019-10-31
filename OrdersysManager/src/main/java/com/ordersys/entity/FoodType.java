package com.ordersys.entity;
/**
 * 菜系实体类
 * @author 向仕懿
 *
 */
public class FoodType {
	/**
	 * 菜系id
	 */
	private int id;
	/**
	 * 菜系名称
	 */
	private String typeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}

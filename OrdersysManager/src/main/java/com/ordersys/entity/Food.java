package com.ordersys.entity;
/**
 *菜品实体类
 * @author 向仕懿
 *
 */
public class Food {
	/**
	 * 菜品id
	 */
	private int id;
	/**
	 * 菜品名称
	 */
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FoodType getType() {
		return type;
	}
	public void setType(FoodType type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * 所属菜系 
	 * 外键对象
	 */
	private FoodType type;
	/**
	 * 价格
	 */
	private int price;
	/**
	 * 菜品描述
	 */
	private String remark;
	/**
	 * 菜品路径
	 */
	private String img;
}

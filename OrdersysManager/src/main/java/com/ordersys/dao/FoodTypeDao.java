package com.ordersys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ordersys.entity.FoodType;

@Mapper
public interface FoodTypeDao {
	/**
	 * 根据id查询菜系名称
	 * @return
	 */
	public FoodType findById();
}

package com.ordersys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
/**
 * 持久层
 * @author 向仕懿
 *
 */

import com.ordersys.entity.Food;
@Mapper
public interface FoodDao {
	/**
	 * 分页查询的方法
	 * @param map
	 * @return
	 */
	public List<Food> All(Map map);
	
	/**
	 * 查询总记录数
	 * @return
	 */
	public int getCount(Map map);
	
	/**
	 * 根据id来查询菜品
	 * @param id
	 * @return
	 */
	public Food ById(int id);
	
	
}

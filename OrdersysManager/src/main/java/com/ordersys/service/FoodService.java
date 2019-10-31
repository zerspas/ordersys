package com.ordersys.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersys.dao.FoodDao;
import com.ordersys.entity.Food;
import com.ordersys.util.PageUtil;

@Service
public class FoodService {
	@Autowired
	FoodDao dao;
	public PageUtil<Food> All(int index,int size,String name) {
		 Map<String, Object> map=new HashMap<String, Object>();
		 if(name!=null) {
			map.put("name", name);
		 }
		 map.put("off", (index-1)*size);
		 map.put("size",size);
		 List<Food> list=dao.All(map);
		 PageUtil<Food> pu=new PageUtil<>();
		 pu.setList(list);
		 pu.setPageIndex(index);
		 pu.setPageSize(size);
		 int count=dao.getCount(map);
		 pu.setRowCount(count);
		 if(count%index==0) {
			 pu.setPageNumber(count/size);
		 }else {
			 pu.setPageNumber(count/size+1);
			 
		 }
		 return pu;
				
	}
	
	public Food ById(int id) {
		return dao.ById(id);
	}
	 
	
}

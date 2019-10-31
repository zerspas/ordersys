package com.ordersys.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ordersys.entity.Food;
import com.ordersys.service.FoodService;
import com.ordersys.util.PageUtil;

@Controller
public class FoodController {
	@Autowired
	FoodService Service;
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")int index,Model model,
			String name) {
		System.out.println(name);
		PageUtil<Food> pu=Service.All(index, 6, name);
		model.addAttribute("pu", pu);
		return "caidan";
	}
	
	@RequestMapping("xiangx")
	public String xiangxi(int id,Model model) {
		Food food=Service.ById(id);
		model.addAttribute("food",food);
		System.out.println(food.getName());
		return "caixiangxi";
	}
}

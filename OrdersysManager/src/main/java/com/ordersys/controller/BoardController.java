package com.ordersys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ordersys.entity.Board;
import com.ordersys.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Board>board=service.find();
		model.addAttribute("board",board);
		return "index";
	}
	
}

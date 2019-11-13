package com.ordersys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersys.dao.BoardDao;
import com.ordersys.entity.Board;
@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDao dao;
	
	@Override
	public List<Board> find() {
		return dao.find();
	}
	

}

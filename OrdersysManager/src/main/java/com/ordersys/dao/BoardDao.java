package com.ordersys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ordersys.entity.Board;
@Mapper
public interface BoardDao {
	public List<Board> find();

}

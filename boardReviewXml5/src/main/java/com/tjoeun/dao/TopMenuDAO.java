package com.tjoeun.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.dto.BoardInfoTable;

@Repository
public class TopMenuDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<BoardInfoTable> getTopMenuList(){
		List<BoardInfoTable> topMenuList = sqlSessionTemplate.selectList("topmenu.getTopMenuList");
		return topMenuList;
	}
	
}

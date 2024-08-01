package com.tjoeun.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.beans.Sophomore;
import com.tjoeun.mapper.SophomoreMapper;

@Repository
public class SophomoreDAO {
	@Autowired
	private SophomoreMapper sophomoreMapper;
	
	public List<Sophomore> selectAll(){
		List<Sophomore> SophomoreList = sophomoreMapper.selectAll();
		return SophomoreList;
		
	}
}

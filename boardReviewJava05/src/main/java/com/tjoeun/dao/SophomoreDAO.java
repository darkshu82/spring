package com.tjoeun.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.dto.Sophomore;
import com.tjoeun.mapper.SophomoreMapper;

@Repository
public class SophomoreDAO {
	
	@Autowired
	private SophomoreMapper sophomoreMapper;
	
	public List<Sophomore> getSophomoreList(){
		List<Sophomore> sophomoreList = sophomoreMapper.getSophomoreList();
		return sophomoreList;
	}
	
	
}

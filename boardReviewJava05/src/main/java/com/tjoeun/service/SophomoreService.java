package com.tjoeun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjoeun.dao.SophomoreDAO;
import com.tjoeun.dto.Sophomore;

@Service
public class SophomoreService {
	
	@Autowired
	private SophomoreDAO sophomoreDAO;
	
	public List<Sophomore> getSophomoreList(){
		List<Sophomore> sophomoreList = sophomoreDAO.getSophomoreList();
		return sophomoreList;
	}
	
}

package com.tjoeun.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.dto.Officer;
import com.tjoeun.mapper.OfficerMapper;

@Repository
public class OfficerDAO {
	
	@Autowired
	private OfficerMapper officerMapper;
	
	public List<Officer> getOfficerList(){
		List<Officer> officerList = officerMapper.getOfficerList();
		return officerList;
	}
	
}

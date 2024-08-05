package com.tjoeun.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.dto.Developer;
import com.tjoeun.mapper.DeveloperMapper;

@Repository
public class DeveloperDAO {
	
	@Autowired
	private DeveloperMapper developerMapper;
	
	public List<Developer> getDeveloperList(){
		List<Developer> developerList = developerMapper.getDeveloperList();
		return developerList;
	}
	
}

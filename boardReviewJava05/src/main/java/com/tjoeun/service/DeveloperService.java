package com.tjoeun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjoeun.dao.DeveloperDAO;
import com.tjoeun.dto.Developer;

@Service
public class DeveloperService {
	
	@Autowired
	private DeveloperDAO developerDAO;
	
	public List<Developer> getDeveloperList(){
		List<Developer> developerList = developerDAO.getDeveloperList();
		return developerList;
	}
	
	
}
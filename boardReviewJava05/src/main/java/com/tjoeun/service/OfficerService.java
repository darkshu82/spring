package com.tjoeun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjoeun.dao.OfficerDAO;
import com.tjoeun.dto.Officer;

@Service
public class OfficerService {
	
	@Autowired
	private OfficerDAO officerDAO;
	
	public List<Officer> getOfficerList(){
		List<Officer> officerList = officerDAO.getOfficerList();
		return officerList;
	}
	
	
}

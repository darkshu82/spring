package com.tjoeun.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.tjoeun.dto.Officer;

public interface OfficerMapper {
	
	@Select("SELECT * FROM OFFICER ORDER BY OFFICERNO")
	List<Officer> getOfficerList();
	
}

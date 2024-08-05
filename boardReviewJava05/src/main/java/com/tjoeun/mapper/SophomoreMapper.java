package com.tjoeun.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.tjoeun.dto.Sophomore;

public interface SophomoreMapper {
	
	@Select("SELECT * FROM SOPHOMORE ORDER BY STDNO")
	List<Sophomore> getSophomoreList();
	
}

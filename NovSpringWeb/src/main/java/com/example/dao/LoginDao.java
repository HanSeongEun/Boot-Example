package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginDao {
	@Select(" select password from mems where userid = #{id}")
	String login(String id);
}
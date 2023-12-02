package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Dept;

@Mapper
public interface DeptDao {
	
	int updateDept(Dept dept);
	
	List<Dept> searchDept(String search);
	
	int nwDeptno();
	
	List<Dept> deptAll(); 

	int addDept(Dept dept);
	
	Dept deptOne(int deptno);
	
}  

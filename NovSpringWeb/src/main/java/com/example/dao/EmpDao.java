package com.example.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Emp;

@Mapper
public interface EmpDao {
	
	List<Emp> search(String ename);
	
	Emp empinfo(int empno);
	
	List<Map<String, Object>> emps(int deptno);
	
}

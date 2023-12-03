package com.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmpDao;
import com.example.dto.Emp;

@Service
public class EmpService {
	
	@Autowired
	EmpDao dao;
	
	public List<Emp> search(String ename){
		return dao.search(ename);
	} 
	
	public Emp empinfo(int empno) {
		return dao.empinfo(empno);
	}
	
	
	public List<Map<String, Object>> emps(int deptno){
		return dao.emps(deptno);
	}
	
}

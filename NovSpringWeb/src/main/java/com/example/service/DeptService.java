package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DeptDao;
import com.example.dto.Dept;

@Service
public class DeptService {
	
	@Autowired
	DeptDao dao;
	
	public List<Dept> depts(){
		return dao.depts();
	}
	
	public int deleteDept(int deptno) {
		return dao.deleteDept(deptno);
	}
	  
	public int updateDept(Dept dept) {
		return dao.updateDept(dept);
	}
	
	public Dept deptOne(int deptno) {
		return dao.deptOne(deptno);
	}
	
	public List<Dept> searchDept(String search){
		return dao.searchDept(search);
	}
	
	public int nwDeptno() {
		return dao.nwDeptno();
	}
	
	public List<Dept> deptAll(){
		return dao.deptAll();
	}
	
	public int addDept(Dept dept) {
		return dao.addDept(dept);
	}
	
	
}

package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.Emp;
import com.example.service.EmpService;
import com.google.gson.Gson;

@Controller
public class EmpController {
	
	@Autowired
	EmpService service;
	
	@GetMapping("/emp/nameform")
	public void form() {
	}
	
	@GetMapping("/emp/result")
	public void result(String ename, Model m) {
		List<Emp> result = service.search(ename);
		m.addAttribute("elist", result);
	}
	
	@RequestMapping("/emp/empinfo")
	@ResponseBody
	public String empinfo(int empno) {
		Emp emp = service.empinfo(empno);
		Gson gson = new Gson();
		String json = gson.toJson(emp);
		return json;
	}
	
	@RequestMapping("/emp/emps")
	@ResponseBody
	public String emps(int deptno) {
		 
		List<Map<String, Object>> elist = service.emps(deptno);
		
		Gson gson = new Gson();
		String json = gson.toJson(elist);
		//System.out.println(json);
		
		return json;
				
	}
}

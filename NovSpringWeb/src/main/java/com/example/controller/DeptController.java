package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.dto.Dept;
import com.example.service.DeptService;


@Controller
public class DeptController {
	
	@Autowired
	DeptService dservice;
	
	@GetMapping("/dept/update/{deptno}")
	public String updateForm(@PathVariable int deptno, Model m) {
		//select 추가
		Dept dept = dservice.deptOne(deptno);
		m.addAttribute("dept", dept);
		return "dept/update";
	}
	@PutMapping("/dept/update")
	 public String update(Dept dept) {
		dservice.updateDept(dept);
		return "redirect:/";
		
	}
	
	
	@GetMapping("/dept/search")
	public void searchForm() {}
	
	@GetMapping("/dept/result")
	public void searchResult(String search, Model m) {
		List<Dept> dlist = dservice.searchDept(search);
		m.addAttribute("dlist", dlist);
		m.addAttribute("search", search);
				
	}
	
	@GetMapping("/dept/insert")
	public void form(Model m) {
		int nwdeptno = dservice.nwDeptno();
		m.addAttribute("nwno", nwdeptno);
	}
	@PostMapping("/dept/insert")
	public String submit(@ModelAttribute("dept") Dept dept) {
		dservice.addDept(dept);
		return "dept/submit";
	}
	
	@GetMapping("/deptAll")
	public String deptAll(Model m) {
		List<Dept> dlist = dservice.deptAll();
		m.addAttribute("deptAll",dlist);

		return "dept/deptAll";
	}	
		
}

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rest")
public class RestTestController {
	
	@GetMapping
	public String form() {
		return "rest/form";
	}
	@PostMapping
	public String postSubmit(String name) {
		System.out.println("name : "+ name);
		return "redirect:/"; //index.html
	}
	@PutMapping
	public String putSubmit(String name) {
		System.out.println("put name : "+name);
		return "redirect:/";
	}
	@DeleteMapping
	public String deleteSubmit(String name) {
		System.out.println("delete name : "+name);
		return "redirect:/";
	}
}













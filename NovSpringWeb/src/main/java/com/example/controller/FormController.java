package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.command.FormCommand;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form() {
		return "form/form";
	}
	
	@PostMapping("/form")
	public String submit(FormCommand data) {
		System.out.println(data);
		return "redirect:/";
	}
	
}

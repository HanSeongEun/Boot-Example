package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.command.InfoCommand;

@Controller
public class AController {
	
	@GetMapping("/a")
	public String a() {
		return "test/a";
	}
	
	@PostMapping("/a")
	public String info(InfoCommand info) {
		return "test/info";
	}
	
}

package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

//@Controller
@RestController
public class GetDataContorller {
	
	@RequestMapping("/jsondata")
	//@ResponseBody
	public String getData() {
		List<String> list = new ArrayList<>();
		list.add("melon");
		list.add("fig");
		list.add("복숭아");
		list.add("apple");
		
		Gson gson = new Gson();
		return gson.toJson(list);
		
	}
	
	
}

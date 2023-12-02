package com.example.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class FormCommand {
	
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm")
	private Date birth;
	private Address address;
}

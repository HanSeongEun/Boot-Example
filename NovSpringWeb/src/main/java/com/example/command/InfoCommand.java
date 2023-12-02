package com.example.command;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class InfoCommand {
	
	private String name;
//	private String[] lang;
	private List<String> lang;
	@DateTimeFormat(pattern="yyyyMMdd")
	private Date resevation; //yyyy/MM/dd형식은 자동 변환
							 //그 외 나머지 패턴은 지정	
	private Integer number;
}

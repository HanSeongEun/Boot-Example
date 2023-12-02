package com.example.command;

import lombok.Data;

@Data
public class NewArticleCommand {

	private int parentId;
	//파라미터는 String이지만 기본형 데이터인 경우 자동으로 변환 시켜서 저장 
	//int 타입인 경우 : 숫자로만 이루어진 데이터를 보내야 한다.
	private String title;
	private String content;
}









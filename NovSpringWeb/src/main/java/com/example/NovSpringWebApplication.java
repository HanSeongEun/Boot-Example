package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example", "com.test"})
public class NovSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovSpringWebApplication.class, args);
	}

	@Bean
	HiddenHttpMethodFilter hiddenHttpMethodFilter(){
		return new HiddenHttpMethodFilter();
	}
	// _method라는 이름으로 전달된 값을 요청방식으로 인식한다.

	
	
}

package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.SearchCommand;
import com.example.command.SearchType;
import com.example.service.SearchResult;
import com.example.service.SearchService;

@Controller
public class GameSearchController {
	@Autowired 
	private SearchService searchService;

	@ModelAttribute("searchTypeList")
	public List<SearchType> referenceSearchTypeList() {
		List<SearchType> options = new ArrayList<SearchType>();
		options.add(new SearchType(1, "전체"));
		options.add(new SearchType(2, "뉴스"));
		options.add(new SearchType(3, "블로그"));
		return options;
	}

	@ModelAttribute("popularQueryList")
	public String[] getPopularQueryList() {
		return new String[] { "게임", "웹툰", "IT" };
	}

	@RequestMapping("/search/main")
	public String main() {
		return "search/main";
	}

	@RequestMapping("/search/game")
	public String search(@ModelAttribute("command") SearchCommand command, Model m) {
		
		System.out.println("검색어 = " + command.getQuery().toUpperCase());
		
		SearchResult result = searchService.search(command);
		m.addAttribute("searchResult", result);
		
		return "search/game";
	}

	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerException(NullPointerException ex) {
		return "error/nullException";//view name
	}

	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

}

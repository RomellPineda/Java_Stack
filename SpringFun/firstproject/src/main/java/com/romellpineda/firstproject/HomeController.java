package com.romellpineda.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

//	@RequestMapping("/")
//	public String hello() {
//		return "Hello Universe";
//	}
	
	@RequestMapping("/random")
	public String random() {
		return "Make a wonderful day!";
	}
	
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if (searchQuery == null) {
			return "You searched for nothing";
		} else {
			return "You've entered a value of: " + searchQuery;
		}
	}
}

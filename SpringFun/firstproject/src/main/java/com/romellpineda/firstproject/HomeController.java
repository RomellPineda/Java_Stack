package com.romellpineda.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
//	@RequestMapping("/")
//	public String index(@RequestParam(value="q", required=false) String searchQuery) {
//		if (searchQuery == null) {
//			return "You searched for nothing";
//		} else {
//			return "You've entered a value of: " + searchQuery;
//		}
//	}
	
	@RequestMapping("/")
	public String greet(@RequestParam(value="name", required=false) String first) {
		if (first != null) {
			return "Hello " + first;
		} else {
			return "Hello Human";
		}
	}
	
	@RequestMapping(value="/coding", method=RequestMethod.GET)
	public String coding() {
		return "Hello Coding Dojo";
	}
	
	@RequestMapping(value="/coding/python", method=RequestMethod.GET)
	public String python() {
		return "Python + Django was awesome!";
	}
	
	@RequestMapping(value="/coding/java", method=RequestMethod.GET)
	public String java() {
		return "Java + Spring is better!";
	}
	
	@RequestMapping("/m/{track}/{module}/{lesson}")
	public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
		return "Track: " + track + " Module: " + module + " Lesson: " + lesson;
	}
	
	@RequestMapping("/{variable}")
	public String variable(@PathVariable("variable") String variable) {
		if (variable == "dojo") {
			return "The Dojo is great!";
		} else if (variable == "burbank-dojo") {
			return "Southern California isn't so bad";
		} else if (variable == "san-jose") {
			return "The original chicken and waffle";
		} else {
			return "Ya!! " + variable;
		}
	}
	
}

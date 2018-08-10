package com.romellpineda.routes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{variable}")
	public String reply(@PathVariable("variable") String variable) {
		return "The dojo is awesome! Your variable is " + variable;
	}
	
	@RequestMapping("/{variable}-dojo")
	public String location(@PathVariable("variable") String variable) {
		return "Burbank Dojo is located in Southern California. Your variable is " + variable;
	}
	
//	@RequestMapping("/{variable}-{other}")
//	public String other(@PathVariable("variable") String variable, @PathVariable("other") String other) {
//		return "The SJ dojo is the headquarters. Your variable is " + variable + "Your other is ";
//	}
//	
}

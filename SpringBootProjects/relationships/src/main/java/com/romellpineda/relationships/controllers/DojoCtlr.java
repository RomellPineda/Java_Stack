package com.romellpineda.relationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.romellpineda.relationships.models.Dojo;

@Controller
public class DojoCtlr {

	@GetMapping("/dojos")
	public String dojos() {
		return "/dojos/index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojos(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/new.jsp";
	}
	
	@PostMapping("/dojos/new/create")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		return "/dojos/index.jsp";
	}
}

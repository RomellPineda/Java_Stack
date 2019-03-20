package com.romellpineda.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.romellpineda.relationships.models.Person;
import com.romellpineda.relationships.services.LicenseService;

@Controller
public class LicenseCtlr {

	@Autowired
	private LicenseService lS;
	
	@GetMapping("/person/new")
	public String home() {
		return "/licenses/index.jsp";
	}
	
	@PostMapping("/person/new/create")
	public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			lS.create(person);
			return "index.jsp";
		}
	}
}

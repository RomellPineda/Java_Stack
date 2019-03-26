package com.romellpineda.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.romellpineda.relationships.models.Dojo;
import com.romellpineda.relationships.services.DojoService;

@Controller
public class DojoCtlr {
	
	@Autowired
	private DojoService dS;

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
		if (result.hasErrors()) {
			return "redirect:/dojos";
		} else {
			Dojo createdDojo = dS.createDojo(dojo);
			return "redirect:/dojos/" + createdDojo.getId();
		}
	}
	
	@GetMapping("/dojos/{dojoId}")
	public String show(@PathVariable("dojoId") Long dojId, Model model) {
		Dojo doj = dS.findDojo(dojId);
		model.addAttribute("dojo", doj);
		return "dojos/show.jsp";
	}
}

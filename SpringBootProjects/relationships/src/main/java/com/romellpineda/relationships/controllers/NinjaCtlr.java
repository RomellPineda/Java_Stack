package com.romellpineda.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.romellpineda.relationships.models.Ninja;
import com.romellpineda.relationships.services.DojoService;

@Controller
public class NinjaCtlr {
	
	@Autowired
	private DojoService dS;
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDoj", dS.findAllDojos());
		return "/ninjas/new.jsp";
	}
	
	@PostMapping("/ninjas/new/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninj, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/ninjas/new";
		} else {
			Ninja newninj = dS.createNinja(ninj);
			return "redirect:/dojos/" + newninj.getDojo().getId();
		}
	}

}

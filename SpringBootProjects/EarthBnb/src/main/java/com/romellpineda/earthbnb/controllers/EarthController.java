package com.romellpineda.earthbnb.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.romellpineda.earthbnb.models.Place;
import com.romellpineda.earthbnb.services.EarthService;

@Controller
public class EarthController {
	private final EarthService earthservice;
    
    public EarthController(EarthService earthservice) {
		super();
		this.earthservice = earthservice;
	}

	@RequestMapping("/")
    public String index(Model model) {
//        List<Place> places = EarthService.findAll();
//        model.addAttribute("places", places);
        return "index.jsp";
    }

}

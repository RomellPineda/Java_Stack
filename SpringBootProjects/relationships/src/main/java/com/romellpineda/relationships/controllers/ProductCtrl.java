package com.romellpineda.relationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.romellpineda.relationships.models.Product;

@Controller
public class ProductCtrl {

	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("productObj") Product product) {
		return "/products/new.jsp";
	}
}

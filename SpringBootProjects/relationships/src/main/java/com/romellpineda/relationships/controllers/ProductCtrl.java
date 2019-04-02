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

import com.romellpineda.relationships.models.Product;
import com.romellpineda.relationships.services.InventoryService;

@Controller
public class ProductCtrl {
	
	@Autowired
	private InventoryService iS;

	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("productObj") Product product) {
		return "/products/new.jsp";
	}
	
	@PostMapping("/products")
	public String createProduct(@Valid @ModelAttribute("productObj") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "/products/new.jsp";
		} else {
			Product savedProduct = iS.saveProduct(product);
			return "redirect:/products/" + savedProduct.getId();
		}
	}
	
	@GetMapping("/products/{id}")
	public String getProduct(@PathVariable("id") Long id, Model model) {
		model.addAttribute("productObj", iS.getProductById(id));
		return "/products/show.jsp";
	}
	
}

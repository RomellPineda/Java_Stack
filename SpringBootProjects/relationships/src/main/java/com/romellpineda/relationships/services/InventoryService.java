package com.romellpineda.relationships.services;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romellpineda.relationships.models.Category;
import com.romellpineda.relationships.models.Product;
import com.romellpineda.relationships.repositories.CategoryRepository;
import com.romellpineda.relationships.repositories.ProductRepository;

@Service
public class InventoryService {
	@Autowired
	private ProductRepository pR;
	
	@Autowired
	private CategoryRepository cR;

	public Product saveProduct(@Valid Product product) {
		return pR.save(product);
	}

	public Category saveCategory(@Valid Category category) {
		return cR.save(category);
	}

	public Product getProductById(Long id) {
		Optional<Product> optional = pR.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}
	
	
}

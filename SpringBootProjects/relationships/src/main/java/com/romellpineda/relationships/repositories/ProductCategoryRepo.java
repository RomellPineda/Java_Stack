package com.romellpineda.relationships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.romellpineda.relationships.models.ProductCategory;

@Repository
public interface ProductCategoryRepo extends CrudRepository<ProductCategory, Long> {

}

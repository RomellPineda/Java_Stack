package com.romellpineda.relationships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.romellpineda.relationships.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}

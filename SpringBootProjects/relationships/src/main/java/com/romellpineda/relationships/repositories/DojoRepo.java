package com.romellpineda.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.romellpineda.relationships.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
	
	List<Dojo> findAll();

}

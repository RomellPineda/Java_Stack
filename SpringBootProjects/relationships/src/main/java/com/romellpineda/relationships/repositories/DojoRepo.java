package com.romellpineda.relationships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.romellpineda.relationships.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {

}

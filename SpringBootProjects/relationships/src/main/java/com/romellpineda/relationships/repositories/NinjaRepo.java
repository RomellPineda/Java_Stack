package com.romellpineda.relationships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.romellpineda.relationships.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {

}

package com.romellpineda.earthbnb.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.romellpineda.earthbnb.models.Place;

@Repository
public interface PlaceRepo extends CrudRepository<Place, Long>{
	List<Place> findAll();

}

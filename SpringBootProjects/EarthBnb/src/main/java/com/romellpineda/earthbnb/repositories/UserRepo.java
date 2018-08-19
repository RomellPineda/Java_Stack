package com.romellpineda.earthbnb.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.romellpineda.earthbnb.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
	List<User> findAll();

}

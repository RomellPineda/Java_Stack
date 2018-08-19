package com.romellpineda.school.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.romellpineda.school.models.Instructor;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {
	List<Instructor> findAll();

}

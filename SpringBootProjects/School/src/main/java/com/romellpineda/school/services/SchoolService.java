package com.romellpineda.school.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.romellpineda.school.models.Instructor;
import com.romellpineda.school.models.Student;
import com.romellpineda.school.repositories.InstructorRepository;
import com.romellpineda.school.repositories.StudentRepository;

@Service
public class SchoolService {
	private final InstructorRepository iR;
	private final StudentRepository sR;
	
	public SchoolService(InstructorRepository iR, StudentRepository sR) {
		this.iR = iR;
		this.sR = sR;
	}

	public List<Instructor> getAllInstructors() {
		return iR.findAll();
	}

	public void createStudent(@Valid Student student) {
		sR.save(student);
	}

	public List<Student> getAllStudents() {
		return sR.findAll();
	}
	
}

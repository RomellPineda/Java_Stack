package com.romellpineda.school.services;

import java.util.List;
import java.util.Optional;

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

	public Instructor findInstructor(Long id) {
		Optional<Instructor> optionalInstructor = iR.findById(id);
		if(optionalInstructor.isPresent()) {
            return optionalInstructor.get();
        } else {
            return null;
        }
	}

	public void deleteInstructor(Long id) {
		iR.deleteById(id);
		
	}
	
	public void updateInstructor(@Valid Instructor instructor) {
		iR.save(instructor);
	}
	
// Incorrect: Archived to document initial thought process	
//	public Instructor findInstructor(Long id) {
//		Optional<Instructor> optionalInstructor = iR.findById(id);
//		if(optionalInstructor.isPresent()) {
//            return optionalInstructor.get();
//        } else {
//            return null;
//        }
//	}	


//	public Student findStudent(Long id) {
//		Optional<Student> optionalStudent = sR.findById(id);
//		if(optionalStudent.isPresent()) {
//            return optionalStudent.get();
//        } else {
//            return null;
//        }
//	}
}

package com.romellpineda.school.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.romellpineda.school.models.Instructor;
import com.romellpineda.school.models.Student;
import com.romellpineda.school.services.SchoolService;

@Controller
public class SchoolController {
	private final SchoolService sS;

	public SchoolController(SchoolService sS) {
		this.sS = sS;
	}

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("students", sS.getAllStudents());
		return "students/index.jsp";
	}
	
	@RequestMapping("/students/new")
	public String newStudent(@ModelAttribute("student") Student student, Model model) {
		List<Instructor> instructors = sS.getAllInstructors();
		model.addAttribute("instructors", instructors);
		return "students/new.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "students/new.jsp";
		}
		else {
			sS.createStudent(student);
			return "redirect:/";
		}
	}
}

package com.romellpineda.school.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.romellpineda.school.models.Instructor;
import com.romellpineda.school.models.Student;
import com.romellpineda.school.services.SchoolService;

@Controller
public class SchoolController {
	private final SchoolService sS;

	public SchoolController(SchoolService sS) {
		this.sS = sS;
	}
	
	@RequestMapping("/test")
	public String test() {
		return "students/new1.jsp";
	}

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("students", sS.getAllStudents());
		return "students/index.jsp";
	}
	
	@GetMapping("/students/new")
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
// Incorrect: Archived to document initial thought process	
//	@GetMapping("/course/{id}")
//    public String show(@PathVariable("id") Long id, Model model) {
//        Instructor instructor = SchoolService.findInstructor(id);
//        model.addAttribute("instructor", instructor);
//        return "/instructor/show.jsp";
//    }
	@RequestMapping("/course/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Instructor instructor = sS.findInstructor(id);
//        return instructor;
        model.addAttribute("instructor", instructor);
        return "/instructor/show.jsp";
    }
	
	@RequestMapping(value="/course/{id}/delete", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        sS.deleteInstructor(id);
        return "redirect:/";
    }
}

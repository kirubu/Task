package org.gorl.controller;

import org.gorl.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController 
{
	private StudentService service;

	public StudentController(StudentService service) 
	{
		this.service = service;
	}
	
	@GetMapping("/students")
	public String getAllStudent(Model model)
	{
		model.addAttribute("students", service.getAllStudent());
		return "students";
		
	}
	
}

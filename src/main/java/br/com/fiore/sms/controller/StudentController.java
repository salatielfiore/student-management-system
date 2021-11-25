package br.com.fiore.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.fiore.sms.entity.Student;
import br.com.fiore.sms.service.StudentService;

@Controller
public class StudentController {
	
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping(path = "/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		
		return "students";
	}
	
	@GetMapping(path = "/student/new")
	public String newStudent(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		ControllerHelper.textTitle(model, "Create New Student");
		
		return "create_student";
	}
	
	
	@PostMapping(path = "/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		
		return "redirect:/students";
	}
	
	@GetMapping(path = "/student/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {
		
		model.addAttribute("student", studentService.findById(id));
		ControllerHelper.textTitle(model, "Update Student");
		
		return "create_student";
	}
	
	
	@GetMapping(path = "/student/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		studentService.delete(id);
		
		return "redirect:/students";
	}
	
	

}

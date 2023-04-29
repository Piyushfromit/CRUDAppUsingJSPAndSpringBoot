package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student.model.Student;
import com.student.service.StudentService;



@Controller
public class StudentController {
	
    @Autowired
    StudentService studentService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	// for View List of Student
	@GetMapping("/view_student")
	public String getStudentList(Model model) {
		List<Student> list = studentService.getAllStudent();
		model.addAttribute("studentList", list);
		return "view_student";    
	}
	
	//add New Student
	@GetMapping("/add_student")
	public String addStudent(Model model) {
        model.addAttribute("command", new Student() );
		return "add_student";
	}
	
	//add New Student
	@PostMapping("/add-student")
	public String saveStaff(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		return "redirect:/view_student";
	}
	
	
	@GetMapping("/editStudentById/{id}")
	public String updateStudentById(@PathVariable Integer id, Model model) {
		model.addAttribute("id",id);
		model.addAttribute("command", studentService.findByIdStudent(id));
		return "update_student";
	}
	
	@RequestMapping("/editStudentById/{id}")
	public String updateStudentById(@PathVariable Integer id, Student student, Model model) {
		studentService.saveByIdStudent(id,student);
		return "redirect:/view_student";
		
	}
		
	
	// for delete Student
	@GetMapping("/deleteStudentById/{id}")
	public String deleteStudentById( @PathVariable("id") Integer stuId){
		studentService.deleteStudentById(stuId);
		return "redirect:/view_student";
	}
	
	
	

}

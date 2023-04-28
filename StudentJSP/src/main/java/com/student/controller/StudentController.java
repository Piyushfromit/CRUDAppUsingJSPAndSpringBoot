package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student.model.Student;
import com.student.service.StudentService;



@Controller
public class StudentController {
	
    @Autowired
    StudentService studentService;
    
    
	@GetMapping("/message")
	public String printMessage() {
	    return "hello";
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
//	@GetMapping("/view_student")
//	public ModelAndView getStudentList() {
//		List<Student> list = studentService.getAllStudent();
//		//A variable named studentList will be sent to view_student.jsp page such that the variable
//		//contains the list of students
//		ModelAndView mv = new ModelAndView("view_student", "studentList", list);
//		return mv;
//	}
	
	
	@GetMapping("/view_student")
	public String getStudentList(Model model) {
		List<Student> list = studentService.getAllStudent();
		model.addAttribute(list);
		return "view_student";    
	}
	
	
	@GetMapping("/add_student")
	public ModelAndView addStudent() {

		ModelAndView mv =new ModelAndView("add_student", "command", new Student() );
		
		return mv;
	}

	@PostMapping("/save-student")
	public String saveStaff(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		return "redirect:/view_student";
	}

}

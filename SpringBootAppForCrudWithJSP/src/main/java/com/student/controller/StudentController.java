package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student.model.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	
	//https://springjava.com/spring-boot/spring-boot-crud-operations-with-jsp
	@Autowired
	StudentService studentService;

//	@GetMapping("/")
//	public ModelAndView getAllStudents() {
//		ModelAndView mav = new ModelAndView("index");
//		List<Student> studentList = studentService.getAll();
//	    System.out.println(studentService.getAll());
//		mav.addObject("students", studentList);
//		return mav;
//	}
	
	
	@GetMapping("/")
	public ModelAndView getStudentList() {
		List<Student> list = studentService.getAll();
		//A variable named studentList will be sent to view_student.jsp page such that the variable
		//contains the list of students
		ModelAndView mv = new ModelAndView("index", "students", list);
		return mv;
	}
	

	@GetMapping("/add-student")
	public ModelAndView addStudent() {
		ModelAndView mav = new ModelAndView("add_student");
		mav.addObject("command", new Student());
		return mav;
	}

	@PostMapping("/save-student")
	public String saveStaff(@ModelAttribute Student student) {
		studentService.save(student);
		return "redirect:/";
	}

	@GetMapping("/student-update/{id}")
	public ModelAndView getStaff(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("add_student");
		Student student = studentService.getById(id);
		mav.addObject("command", student);
		return mav;
	}

	@GetMapping("/student-delete/{id}")
	public String deleteStaff(@PathVariable("id") Integer id) {
		Student deleteStaff = studentService.getById(id);
		studentService.delete(deleteStaff);
		return "redirect:/";
	}

}

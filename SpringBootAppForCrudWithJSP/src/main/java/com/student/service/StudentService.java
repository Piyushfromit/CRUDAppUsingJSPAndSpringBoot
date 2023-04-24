package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	
	
	void save(Student student);
	List<Student> getAll();
	Student getById(Integer id);
	void delete(Student student);

}

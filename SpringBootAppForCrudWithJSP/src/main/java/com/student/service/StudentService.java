package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	
	
	public void save(Student student);
	public List<Student> getAll();
	public Student getById(Integer id);
	public void delete(Student student);

}

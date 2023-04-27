package com.student.service;

import java.util.List;


import com.student.model.Student;

public interface StudentService {
	
    public List<Student> getAllStudent();
	
	public Student saveStudent(Student  student);
	
	public Student  getStudentById(Integer id);
	
	public Student  updateStudent(Student  student);

	public void  deleteStudentById(Integer id);
	
	

}

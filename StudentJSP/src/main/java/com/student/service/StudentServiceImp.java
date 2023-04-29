package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repo.StudentRepo;



@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	
	public StudentServiceImp(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	
	

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = studentRepo.findAll();
		if (list.size() == 0) {
			return null;
		}
		return list;
	}

	@Override
	public Student saveStudent(Student student) {
		  if(student == null) {
			return null;
	      }
	      return studentRepo.save(student);
		
	}

	@Override
	public Student getStudentById(Integer id) {
		
        Optional<Student> opt = studentRepo.findById(id);
		
        if (!opt.isPresent()) {
        	return null;
			
		} else {
			return opt.get();
		}
		
		
	}

	@Override
	public Student updateStudent(Student student) {
		Optional<Student> opt = studentRepo.findById(student.getId());
		if (opt.isPresent()) {
			studentRepo.save(student);
		} else {
			return null;
		}
		return student;
	}

	@Override
	public Student deleteStudentById(Integer id) {
		Optional<Student> opt = studentRepo.findById(id);
		if (opt.isPresent()) {
			studentRepo.delete(opt.get());
		} 
		return opt.get();
	}




	@Override
	public Optional<Student> findByIdStudent(Integer id) {
		return studentRepo.findById(id);
	}

	@Override
	public Student saveByIdStudent(Integer id, Student student) {
		Student student2=studentRepo.findById(id).orElse(null);
		student2.setName(student.getName());
		student2.setMarks(student.getMarks());
		student2.setAddress(student.getAddress());
		return student2;
		
	}
	
	
	

}

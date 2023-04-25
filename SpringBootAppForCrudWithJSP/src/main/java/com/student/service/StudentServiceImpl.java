package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repo.StudentRepo;



@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepository;

	@Override
	public void save(Student student) {
		if (student.getId() == null) {
			studentRepository.save(student);
		} else {
			Student staffUpdate = studentRepository.findById(student.getId()).get();
			staffUpdate.setName(student.getName());
			staffUpdate.setRollNo(student.getRollNo());
			staffUpdate.setEmailId(student.getEmailId());
			studentRepository.save(staffUpdate);
		}
	}

	@Override
	public List<Student> getAll() {
		
		List<Student> list=  studentRepository.findAll();
		
		// System.out.println(list.toString());
		if(list.size()==0) {
			return null;
		}
		return list;
	}
	
	

	@Override
	public Student getById(Integer id) {
		return studentRepository.findById(id).get();

	}

	@Override
	public void delete(Student student) {
		studentRepository.delete(student);
	}


	
	
	
}

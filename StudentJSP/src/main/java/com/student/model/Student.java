package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 private String name;
	 private Integer marks;
	 private String address;
	 
 
	 public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(Integer id, String name, Integer marks, String address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getMarks() {
		return marks;
	}


	public void setMarks(Integer marks) {
		this.marks = marks;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	 
	 
	 
	 

}

package com.service;

import java.util.ArrayList;

import com.model.Student;

public interface Studentservice {

	public void addstudent(Student s);
	public ArrayList<Student> getallstudent();
	public Student getbyid(int id);
	public void deletestudent(int id);
	
}

package com.dao;

import java.util.ArrayList;

import com.model.Student;

public interface Studentdao {

	public void addstudent(Student s);
	public ArrayList<Student> getallstudent();
	public Student getbyid(int id);
	public void deletestudent(int id);
}

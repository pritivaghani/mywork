package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Studentdao;
import com.model.Student;

@Service
public class StudentserviceIMPL implements Studentservice
{

	@Autowired
	Studentdao studentdao;
	
	
	@Override
	public void addstudent(Student s) {
          studentdao.addstudent(s);		
	}

	@Override
	public ArrayList<Student> getallstudent() {
		// TODO Auto-generated method stub
		return studentdao.getallstudent();
	}

	@Override
	public Student getbyid(int id) {
		// TODO Auto-generated method stub
		return studentdao.getbyid(id);
	}

	@Override
	public void deletestudent(int id) {
		// TODO Auto-generated method stub
		studentdao.deletestudent(id);
	}

	
}

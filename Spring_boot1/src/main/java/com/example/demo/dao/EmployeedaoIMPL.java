package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;

@Repository
@Transactional
public class EmployeedaoIMPL implements Employeedao
{

	@Override
	public void addemployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getallemployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getemployeebyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteemployee(int id) {
		// TODO Auto-generated method stub
		
	}

}

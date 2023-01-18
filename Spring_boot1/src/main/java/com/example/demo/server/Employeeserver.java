package com.example.demo.server;

import java.util.List;

import com.example.demo.model.Employee;

public interface Employeeserver {

	public void addemployee(Employee e);
	public List<Employee> getallemployee();
	public Employee getemployeebyid(int id);
	public void deleteemployee(int id);
	
}

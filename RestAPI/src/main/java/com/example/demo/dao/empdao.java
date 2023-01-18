package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.emp;

public interface empdao {

	public void addorupdateemp(emp e);
	public List<emp> viewallemp();
	public emp viewbyid(int id);
	public void deleteemp(int id);

}

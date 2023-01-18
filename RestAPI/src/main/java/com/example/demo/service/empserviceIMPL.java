package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.empdao;
import com.example.demo.model.emp;

@Service
public class empserviceIMPL implements empservice
{

	@Autowired
	empdao dao;
	@Override
	public void addorupdateemp(emp e) {

		dao.addorupdateemp(e);
	}

	@Override
	public List<emp> viewallemp() {
		// TODO Auto-generated method stub
		return dao.viewallemp();
	}

	@Override
	public emp viewbyid(int id) {
		// TODO Auto-generated method stub
		return dao.viewbyid(id);
	}

	@Override
	public void deleteemp(int id) {

		dao.deleteemp(id);
	}

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Servantdao;
import com.example.demo.model.Servant;

@Service
public class ServantserviceIMLP implements Servantservice {

	@Autowired
    Servantdao dao;
	
	@Override
	public void addorupdateservant(Servant s) {
		// TODO Auto-generated method stub
		dao.addorupdateservant(s);
	}

	@Override
	public List<Servant> viewallservant() {
		// TODO Auto-generated method stub
		return dao.viewallservant();
	}

	@Override
	public Servant viewbyid(int id) {
		// TODO Auto-generated method stub
		return dao.viewbyid(id);
	}

	@Override
	public void deleteservant(int id) {
		// TODO Auto-generated method stub
		dao.deleteservant(id);
	}

}

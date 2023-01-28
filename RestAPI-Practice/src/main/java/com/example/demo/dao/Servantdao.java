package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Servant;

public interface Servantdao {

	public void addorupdateservant(Servant s);
	public List<Servant> viewallservant();
	public Servant viewbyid(int id);
	public void deleteservant(int id);
}

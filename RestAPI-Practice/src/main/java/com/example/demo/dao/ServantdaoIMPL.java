package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Servant;
import com.example.demo.repo.Servant_Repo;

@Repository
public class ServantdaoIMPL implements Servantdao {

	@Autowired
	Servant_Repo repo;
	
	@Override
	public void addorupdateservant(Servant s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}

	@Override
	public List<Servant> viewallservant() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Servant viewbyid(int id) {

		List<Servant> servantall = repo.findAll();
		for(int i=0;i<servantall.size();i++)
		{
			Servant temp = servantall.get(i);
			if(temp.getId()==id)
			{
				return temp;
			}
		}
		
		return null;
	}

	@Override
	public void deleteservant(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

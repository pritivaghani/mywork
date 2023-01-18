package com.example.demo.dao;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.emp;
import com.example.demo.repo.emprepo;

@Repository
public class empdaoIMPL implements empdao
{

	@Autowired
	emprepo repo;
	
	@Override
	public void addorupdateemp(emp e) {
		// TODO Auto-generated method stub
		repo.save(e);
	}

	@Override
	public List<emp> viewallemp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public emp viewbyid(int id) {

		List<emp> empall =  repo.findAll();
		for(int i=0;i<empall.size();i++)
		{
			emp temp = empall.get(i);
			if(temp.getId()==id)
			{
				return temp;
			}
		}
		
		return null;
	}

	@Override
	public void deleteemp(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

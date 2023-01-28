package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repo.Productrepo;

@Service
public class ProductserviceIMPL implements Productservice {

	
	@Autowired
	Productrepo repo;
	
	@Override
	public void addproduct(Product p) {
		// TODO Auto-generated method stub
		repo.save(p);
	}

	@Override
	public ArrayList<Product> viewallproduct() {
		// TODO Auto-generated method stub
		return (ArrayList<Product>) repo.findAll();
	}

	@Override
	public Product viewbyid(int id) {

		ArrayList<Product> productall = (ArrayList<Product>) repo.findAll();
		for(int i=0;i<productall.size();i++)
		{
			Product temp = productall.get(i);
			if(temp.getPid()==id)
			{
				return temp;
			}
		}
		
		return null;
	}

	@Override
	public void updateproduct(Product p, int id) {
  		repo.save(p);
	}

	@Override
	public void deleteproduct(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

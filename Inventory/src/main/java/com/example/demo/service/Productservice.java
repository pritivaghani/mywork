package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.Product;

public interface Productservice {

	public void addproduct(Product p);
	public ArrayList<Product> viewallproduct();
	public Product viewbyid(int id);
	public void updateproduct(Product p, int id);
	public void deleteproduct(int id);
}

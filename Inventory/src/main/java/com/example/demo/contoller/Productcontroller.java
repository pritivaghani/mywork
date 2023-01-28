package com.example.demo.contoller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.Productservice;

@RestController
@RequestMapping("/products")
public class Productcontroller {

	@Autowired
	Productservice productservice;
	
	@PostMapping("/")
	public ResponseEntity addproduct(@RequestBody Product p)
	{
		productservice.addproduct(p);
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
	
	@GetMapping("/")
	public ArrayList<Product> viewallproduct()
	{
		return productservice.viewallproduct();
		
	}
	
	@GetMapping("/{pid}")
	public Product viewbyid(@PathVariable("pid") int id)
	{
		return productservice.viewbyid(id);
		
	}
	
	@DeleteMapping("/{pid}")
	public String deleteproduct(@PathVariable("pid") int id)
	{
		productservice.deleteproduct(id);
		return "delete calling...";
		
	}
	
	@PutMapping("/{pid}")
	public String updateproduct(@RequestBody Product p,@PathVariable("pid") int id)
	{
		p.setPid(id);
		productservice.updateproduct(p, id);
		return "data updated...";
		
	}
}

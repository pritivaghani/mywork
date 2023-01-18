package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.emp;
import com.example.demo.service.empservice;

@RestController
@RequestMapping("/employees")
public class empcontroller {

	@Autowired
	empservice service;
	
	@PostMapping("/")
	public String addemp(@RequestBody emp e)
	{
		service.addorupdateemp(e);
		return "data inserted...";
		
	}
	
	@GetMapping("/")
	public List<emp> viewallemp()
	{
		return service.viewallemp();
		
	}
	@GetMapping("/{eid}")
	public emp viewbyid(@PathVariable("eid") int id)
	{
		System.out.println(id);
		return service.viewbyid(id);
		
	}
	
	@PutMapping("/{eid}")
	public String updateemp(@RequestBody emp e,@PathVariable("eid") int id)
	{
		e.setId(id);
		service.addorupdateemp(e);
		return "data updated";
		
	}
	
	@DeleteMapping("/{eid}")
	public String deleteemp(@PathVariable("eid") int id)
	{
		service.deleteemp(id);
		return "deleted emp";
		
	}
}

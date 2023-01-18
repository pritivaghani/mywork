package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Employee_controller {

	@GetMapping("/")
	public String getdata()
	{
		return "Home";
		
	}
	
	public void addemplyee()
	{
		
	}
}

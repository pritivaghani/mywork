package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.User_service;

@Controller
public class User_controller {

	//@Autowired
	//User_service us;
	
	
	@RequestMapping("/")
	public String index()
	{
		return "Index";
	}
	
	@RequestMapping("/adduser")
	public void adduser()
	{
		
	}
}

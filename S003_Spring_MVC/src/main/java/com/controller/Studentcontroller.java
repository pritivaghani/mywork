package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;

import com.model.Student;
import com.service.Studentservice;

@Controller
public class Studentcontroller {

	@Autowired
	Studentservice studentservice;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView modelAndView = new ModelAndView();
		Student s = new Student();
		modelAndView.addObject("student", s);
		modelAndView.setViewName("Index");
		return modelAndView;
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "Home";
	}
	
	@RequestMapping("/addstudent")
	public ModelAndView addstudent(@ModelAttribute("student") Student s)
	{
		//System.out.println(s.getName()+" "+s.getEmail()+" "+s.getPass());
		studentservice.addstudent(s);
		ModelAndView model = new ModelAndView();
         model.setViewName("Home");		
		return model;
	}
	
	@RequestMapping("/view")
	public ModelAndView viewallstudent()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("data", studentservice.getallstudent());
		model.setViewName("Home");
		return model;
		
	}
	
	@RequestMapping("/delete/{did}")
	public ModelAndView deletestudent(@PathVariable(value = "did") Integer id)
	{
		ModelAndView model = new ModelAndView();
		studentservice.deletestudent(id);
		model.addObject("data", studentservice.getallstudent());
		model.setViewName("Home");
		return model;
		
	}
	
	@RequestMapping("/update/{uid}")
	public ModelAndView getstudentbyid(@PathVariable(value = "uid") Integer id)
	{
		ModelAndView model = new ModelAndView();
		Student s = studentservice.getbyid(id);
		model.addObject("studnet", s);
		model.setViewName("Index");
		return model;
		
	}
}

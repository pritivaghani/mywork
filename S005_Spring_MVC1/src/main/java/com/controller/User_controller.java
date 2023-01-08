package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.Userservice;

@Controller
public class User_controller {

	@Autowired
	Userservice us;
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView();
		User u = new User();
		mv.addObject("user", u);
		mv.addObject("userlist", us.getalluser());
        mv.setViewName("Index");
		return mv;
	}

	@RequestMapping("/home")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("/adduser")
	public ModelAndView adduser(@Valid @ModelAttribute("user") User u, BindingResult rs)
	{
		ModelAndView model = new ModelAndView();
		User user = new User();
		model.addObject("user", user);
		model.addObject("userlist", us.getalluser());
		
		if(rs.hasErrors())
		{
			model.setViewName("Index");
		}
		else
		{
	    System.out.println("test3");
		us.adduser(u);
		model.addObject("msg", "registration succesfully....");
		model.setViewName("Index");
		}
		return model;
	}
	
	@RequestMapping("/delete")
	public String deleteuser(@RequestParam("did") Integer id)
	{
		System.out.println(id);
		us.deleteuser(id);
		return "redirect:/";
		
	}
	
	@RequestMapping("/update")
	public ModelAndView getbyid(@RequestParam("uid") Integer id)
	{
		ModelAndView model = new ModelAndView();
		User user = us.getbyid(id);
		model.addObject("user", user);
		model.addObject("userlist", us.getalluser());
		model.setViewName("Index");
		return model;
		
	}
}
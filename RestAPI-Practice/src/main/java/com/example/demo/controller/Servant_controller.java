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

import com.example.demo.model.Servant;
import com.example.demo.service.Servantservice;

@RestController
@RequestMapping("/servants")
public class Servant_controller {

	@Autowired
	Servantservice servantservice;
	
    @PostMapping("/")
	public String addservant(@RequestBody Servant s)
	{
    	servantservice.addorupdateservant(s);
		return "data inserted...";
		
	}
    
    @GetMapping("/")
    public List<Servant> viewallservant()
    {
		return servantservice.viewallservant();
    	
    }
    
    @GetMapping("/{sid}")
    public Servant viewbyid(@PathVariable("sid") int id)
    {
    	System.out.println(id);
		return servantservice.viewbyid(id);
    	
    }
    
    @PutMapping("/{sid}")
    public String updateservant(@RequestBody Servant s, @PathVariable("sid") int id)
    {
    	s.setId(id);
    	servantservice.addorupdateservant(s);
		return "data updated...";
    	
    }
    
    @DeleteMapping("/{sid}")
    public String deleteservant(@PathVariable("sid") int id)
    {
    	servantservice.deleteservant(id);
		return "data deleted...";
    	
    }
}

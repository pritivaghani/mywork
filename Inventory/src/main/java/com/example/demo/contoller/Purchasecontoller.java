package com.example.demo.contoller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.entity.Purchase;
import com.example.demo.service.Productservice;
import com.example.demo.service.Purchaseservice;

@RestController
@RequestMapping("/purchases")
public class Purchasecontoller {

	@Autowired
	Purchaseservice purchaseservice;
	
	@Autowired
	Productservice productservice;
	
	@PostMapping("/{pcid}")
	public void addpurchase(@RequestBody Purchase pc, @PathVariable("pcid") int pcid)
	{
		Product pd = productservice.viewbyid(pcid);
		pc.setPd(pd);
		purchaseservice.addpurchase(pc);
		
	}
	
	@GetMapping("/")
	public ArrayList<Purchase> viewallpurchase()
	{
		
		return purchaseservice.viewallpurchase();
		
	}
	
	@GetMapping("/{pcid}")
	public Purchase viewbyid(@PathVariable("pcid") int id)
	{
		
		return purchaseservice.viewbyid(id);
		
	}
	
	@DeleteMapping("/{pcid}")
	public String deletepurchase(@PathVariable("pcid") int id)
	{
		purchaseservice.deletepurchase(id);
		return "delete calling...";
		
	}
	
	@PutMapping("/{pcid}")
	public String updatepurchase()
	{
		return null;
		
	}
}

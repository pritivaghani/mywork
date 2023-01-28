package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Purchase;
import com.example.demo.repo.Purchaserepo;

@Service
public class PurchaseserviceIMPL implements Purchaseservice {

	
	@Autowired
	Purchaserepo repo;
	
	@Override
	public void addpurchase(Purchase pc) {
		// TODO Auto-generated method stub
		repo.save(pc);
	}

	@Override
	public ArrayList<Purchase> viewallpurchase() {
		// TODO Auto-generated method stub
		return (ArrayList<Purchase>) repo.findAll();
	}

	@Override
	public Purchase viewbyid(int id) {

		ArrayList<Purchase> purchaseall = (ArrayList<Purchase>) repo.findAll();
		for(int i=0;i<purchaseall.size();i++)
		{
			Purchase temp = purchaseall.get(i);
			if(temp.getPcid()==id)
			{
				return temp;
			}
		}
		return null;
	}

	@Override
	public void updatepurchase(Purchase pc, int id) {
		// TODO Auto-generated method stub
		repo.save(pc);
	}

	@Override
	public void deletepurchase(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

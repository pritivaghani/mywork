package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.Product;
import com.example.demo.entity.Purchase;

public interface Purchaseservice {

	public void addpurchase(Purchase pc);
	public ArrayList<Purchase> viewallpurchase();
	public Purchase viewbyid(int id);
	public void updatepurchase(Purchase pc, int id);
	public void deletepurchase(int id);
}

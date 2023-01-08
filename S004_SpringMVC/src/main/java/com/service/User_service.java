package com.service;

import java.util.ArrayList;

import com.model.User;

public interface User_service {

	
	public void adduser(User u);
	public ArrayList<User> getalluser();
	public User getbyid(int id);
	public void deleteuser(int id);
	
}

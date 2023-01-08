package com.dao;

import java.util.ArrayList;

import com.model.User;

public interface User_Dao {

	public void adduser(User u);
	public ArrayList<User> getalluser();
	public User getbyid(int id);
	public void deleteuser(int id);
	
}

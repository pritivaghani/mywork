package com.service;

import java.util.List;

import com.model.User;

public interface Userservice {

	public void adduser(User u);
	public List<User> getalluser();
	public User getbyid(int id);
	public void deleteuser(int id);
	
}

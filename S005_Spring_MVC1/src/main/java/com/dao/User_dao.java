package com.dao;

import java.util.List;

import com.model.User;

public interface User_dao {

	public void adduser(User u);
	public List<User> getalluser();
	public User getbyid(int id);
	public void deleteuser(int id);

}

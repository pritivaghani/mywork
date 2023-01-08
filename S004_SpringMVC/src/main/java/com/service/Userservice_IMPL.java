package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.User_Dao;
import com.model.User;

@Service
public class Userservice_IMPL implements User_service {

	@Autowired
	User_Dao ud;
	
	
	@Override
	public void adduser(User u) {
         ud.adduser(u);		
	}

	@Override
	public ArrayList<User> getalluser() {
		// TODO Auto-generated method stub
		return ud.getalluser();
	}

	@Override
	public User getbyid(int id) {
		// TODO Auto-generated method stub
		return ud.getbyid(id);
	}

	@Override
	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		ud.deleteuser(id);
	}

}

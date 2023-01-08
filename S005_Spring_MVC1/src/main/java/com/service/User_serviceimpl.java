package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.User_dao;
import com.model.User;

@Service
public class User_serviceimpl implements Userservice
{
    @Autowired
	User_dao userdao;
	
	@Override
	public void adduser(User u) {

		userdao.adduser(u);
	}

	@Override
	public List<User> getalluser() {
		// TODO Auto-generated method stub
		return userdao.getalluser();
	}

	@Override
	public User getbyid(int id) {
		// TODO Auto-generated method stub
		return userdao.getbyid(id);
	}

	@Override
	public void deleteuser(int id) {

		userdao.deleteuser(id);
	}

}

package com.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public class Userdao_IMPL implements User_Dao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void adduser(User u) {
      Session s = sessionFactory.openSession();
    Transaction t = s.beginTransaction();
     s.save(u);
      t.commit();
		
	}

	@Override
	public ArrayList<User> getalluser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getbyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		
	}

}

package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public class Userdao_impl implements User_dao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void adduser(User u) {
		//System.out.println(u.getName()+" "+u.getEmail());

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(u);
		transaction.commit();
	}
	@Override
	public List<User> getalluser() {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		return session.createQuery("from User").list();
	}
	@Override
	public User getbyid(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User u = session.load(User.class, id);
		
		return u;
	}
	@Override
	public void deleteuser(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User u = session.load(User.class, id);
		session.delete(u);
		transaction.commit();
		
	}

}

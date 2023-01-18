package com.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;

@Repository
@Transactional
public class StudentdaoIMPL implements Studentdao {

	@Autowired
    SessionFactory sessionFactory;
	
	@Override
	public void addstudent(Student s) {
			System.out.println(s.getId()+" "+s.getName());
           Session se = sessionFactory.openSession();
           Transaction tx = se.beginTransaction();
           se.saveOrUpdate(s);
		   tx.commit();
		   System.out.println("data inserted...");
		
	}

	@Override
	public ArrayList<Student> getallstudent() {
		  Session se = sessionFactory.openSession();
          Transaction tx = se.beginTransaction();
		
		return (ArrayList<Student>) se.createQuery("from Student").list();
	}

	@Override
	public Student getbyid(int id) {
		 Session se = sessionFactory.openSession();
         Transaction tx = se.beginTransaction();
         return se.get(Student.class, id);
	}

	@Override
	public void deletestudent(int id) {
		 Session se = sessionFactory.openSession();
         Transaction tx = se.beginTransaction();
         Student s = se.get(Student.class, id);
         se.delete(s);
         tx.commit();
	}

}

package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Boy;

public class View_boy {

	public static void main(String[] args) {

		
		Configuration c = new Configuration();
		c.configure("Hibernate.cfg.xml");
		c.addAnnotatedClass(Boy.class);
		
		SessionFactory s = c.buildSessionFactory();
		
		Session se = s.openSession();
		Transaction t = se.beginTransaction();
		
	List<Boy> all = se.createQuery("from Boy").list();
	
	for(Boy b : all)
	{
		System.out.println(b.getId()+" "+b.getBname()+" "+b.getEmail()+" "+b.getPass());
	}
		
	}

}

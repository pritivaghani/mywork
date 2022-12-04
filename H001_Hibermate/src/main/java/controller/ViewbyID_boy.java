package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Boy;

public class ViewbyID_boy {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		c.configure("Hibernate.cfg.xml");
		c.addAnnotatedClass(Boy.class);
		
		SessionFactory s = c.buildSessionFactory();
		
		Session se = s.openSession();
		Transaction t = se.beginTransaction();
		
		Boy b = se.load(Boy.class, 4);
		
		System.out.println(b.getId()+" "+b.getBname()+" "+b.getEmail()+" "+b.getPass());
		
		
		
		
	}

}

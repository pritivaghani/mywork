package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Boy;

public class Update_boy {

	public static void main(String[] args) {

		Boy b = new Boy(3, "raj", "raj@gmail.com", "123");
		
		Configuration c = new Configuration();
		c.configure("Hibernate.cfg.xml");
		c.addAnnotatedClass(Boy.class);
		
		SessionFactory s = c.buildSessionFactory();
		
		Session se = s.openSession();
		Transaction t = se.beginTransaction();
		
		se.saveOrUpdate(b);
		t.commit();
		
		
	}

}

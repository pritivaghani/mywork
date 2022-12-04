package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Boy;

public class Delete_boy {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		c.configure("Hibernate.cfg.xml");
		c.addAnnotatedClass(Boy.class);
		
		SessionFactory s = c.buildSessionFactory();
		
		Session se = s.openSession();
		
		Transaction t = se.beginTransaction();
		
		Boy b = se.load(Boy.class, 3);
		se.delete(b);
		t.commit();
	}

}

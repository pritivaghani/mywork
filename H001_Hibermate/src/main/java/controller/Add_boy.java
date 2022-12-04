package controller;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Boy;

public class Add_boy {

	public static void main(String[] args) {

		
		Boy b = new Boy(5, "jemi", "jemi@gmail.com", "1557");
		
		Configuration cfg = new Configuration();
	      cfg.configure("Hibernate.cfg.xml");
	      cfg.addAnnotatedClass(Boy.class);
	      
	      
	      SessionFactory sf = cfg.buildSessionFactory();
	      
	      Session s = sf.openSession();
	      Transaction t = s.beginTransaction();
	      
	      s.persist(b);
	      t.commit();
     
		

	}

}

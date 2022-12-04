package dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Boy;

public class Boy_dao {

	SessionFactory sf;
	
	public Boy_dao()
	{
		
		Configuration c = new Configuration();
		c.configure("resource/Hibernate.cfg.xml");
		c.addAnnotatedClass(Boy.class);
		 sf = c.buildSessionFactory();
		
		
	}
	
	
	
	public void addboy(Boy b) {

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(b);
		t.commit();
		
		
		
		
	}



     public List<Boy> viewboy()
     {
    	 
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		return s.createQuery("from Boy").list();
		
		
	
	}



	public void deleteboy(int id) {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Boy b = s.get(Boy.class, id);
		s.delete(b);
		t.commit();
		
	}



	public Boy getboybyid(int id) {
         Session s = sf.openSession();
         Transaction t = s.beginTransaction();
         
		return s.get(Boy.class, id);
	}

}

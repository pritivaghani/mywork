package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Fruit;

public class Fruit_dao {

	SessionFactory sf;
  public Fruit_dao()
  {
	  Configuration c = new Configuration();
	  c.configure("resource/Hibernate.cfg.xml");
	  c.addAnnotatedClass(Fruit.class);
	  sf = c.buildSessionFactory();
	  
  }

	public void addfruit(Fruit f) {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(f);
		t.commit();
	}

	public List<Fruit> viewfruit() {

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		return s.createQuery("from Fruit").list();
	}

	public void deletefruit(int id) {

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Fruit f = s.get(Fruit.class, id);
		s.delete(f);
		t.commit();
		
	}

	public Fruit getfruitbyid(int id) {

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		return s.get(Fruit.class, id);
	}

}

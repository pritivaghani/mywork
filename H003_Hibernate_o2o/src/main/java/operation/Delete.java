package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Std;
import model.Std_details;

public class Delete {

	public static void main(String[] args) {


		SessionFactory sf = new Configuration()
				.configure("Hibernate.cfg.xml")
				.addAnnotatedClass(Std.class)
				.addAnnotatedClass(Std_details.class)
				.buildSessionFactory();
		
		
		Session s = sf.openSession();
		 Transaction t = s.beginTransaction();
//		Std st = s.load(Std.class, 2);
//		s.delete(st);
//		t.commit();
		 
		 Std_details d = s.load(Std_details.class, 1);
		 s.delete(d);
		 t.commit();
	}

}

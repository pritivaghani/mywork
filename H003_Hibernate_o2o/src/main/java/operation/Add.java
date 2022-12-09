package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Std;
import model.Std_details;

public class Add {

	public static void main(String[] args) {

		
		//Configuration c = new Configuration();
		
		SessionFactory sf = new Configuration()
				.configure("Hibernate.cfg.xml")
				.addAnnotatedClass(Std.class)
				.addAnnotatedClass(Std_details.class)
				.buildSessionFactory();
		
		Std_details sd = new Std_details();
		sd.setAddress("delhi");
		
	Std s = new Std();
	s.setName("meet");
	s.setEmail("meet@gmail.com");
	s.setSd(sd);
		
	Session se = sf.openSession();
	Transaction t = se.beginTransaction();
	//se.save(sd);
	se.save(s);
	t.commit();
	
	}

}

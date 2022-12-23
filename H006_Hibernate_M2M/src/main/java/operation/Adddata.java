package operation;

import java.rmi.StubNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Faculty;
import com.Subject;

public class Adddata {

	public static void main(String[] args) {

		
		SessionFactory sf = new Configuration()
				.configure("resource/Hibernate.cfg.xml")
				.addAnnotatedClass(Faculty.class)
				.addAnnotatedClass(Subject.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//         Faculty f1 = new Faculty();
//         f1.setFname("priti");
//
//		Subject s1 = new Subject();
//		s1.setSname("java");
//		s1.addfaculty(f1);
//		
//		Subject s2 = new Subject();
//		s2.setSname("php");
//		s2.addfaculty(f1);
//		
//		s.save(f1);
//		s.save(s1);
//		s.save(s2);
		
//		Subject s1 = s.load(Subject.class, 2);
//		
//		Faculty f1 = new Faculty();
//		f1.setFname("rahul");
//		f1.addsubject(s1);
//		
//		
//		
//		s.save(f1);
//		
		
		Faculty f1 = s.load(Faculty.class, 2);
		
	Subject s1 = new Subject();
	s1.setSname("selenium");
	s1.addfaculty(f1);
	
	s.save(s1);
		
		t.commit();
		
		
	}

}

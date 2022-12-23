package operation;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Faculty;
import com.Subject;

public class Viewdata {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resource/Hibernate.cfg.xml")
				.addAnnotatedClass(Faculty.class)
				.addAnnotatedClass(Subject.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		//List<Faculty> all = s.createQuery("from Faculty").list();
		
		List<Faculty> all = s.createQuery("from Faculty where fname='priti'").list();
		
		for(Faculty f : all)
		{
			System.out.println(f.getFname());
	
		for(Subject sub : f.getSubject())
		{
		   System.out.println(sub.getSname());
		}
		}
	}
}

package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Category;
import com.Product;

public class Adddata {

	public static void main(String[] args) {

		
		SessionFactory sf = new Configuration()
				.configure("Hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Category ct = new Category();
		ct.setCname("Electric");
		
		Product p = new Product();
		p.setPname("fan");
		p.setPrice("900");
		p.setC(ct);
		
		Product p1 = new Product();
		p1.setPname("Ac");
		p1.setPrice("2000");
		p.setC(ct);
		
		s.save(ct);
		s.save(p);
		s.save(p1);
		
		t.commit();
		
		
	}

}

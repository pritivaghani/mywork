package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Category;
import com.Product;

public class deletedata {

	public static void main(String[] args) {


		SessionFactory sf = new Configuration()
				.configure("Hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//	Category c = new Category();
//	c.setCname("cosmetic");
		
		//Category c = s.load(Category.class, 1);
		//s.delete(c);
		
		Product p = s.load(Product.class, 2);
		s.delete(p);
	
	//s.delete(c);
	t.commit();
		
		
		
		
	}

}

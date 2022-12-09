package operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Category;
import com.Product;

public class Viewdata {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("Hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		List<Category> ct = s.createQuery("from Category").list();
		for(Category c : ct)
		{
			System.out.println(c.getCname());
			for(Product p : c.getP())
			{
				System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
			}
		}
		
		
		
	}

}

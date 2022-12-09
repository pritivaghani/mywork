package operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Std;
import model.Std_details;

public class View {

	public static void main(String[] args) {


		SessionFactory sf = new Configuration()
				.configure("Hibernate.cfg.xml")
				.addAnnotatedClass(Std.class)
				.addAnnotatedClass(Std_details.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();
//		
//  List<Std>	std = s.createQuery("from Std").list();
//		for(Std st : std)
//		{
//			System.out.println(st.getId()+" "+st.getName()+" "+st.getEmail());
//			System.out.println(st.getSd().getAddress());
//		}
		
		
//		Std st = s.load(Std.class, 3);
//		System.out.println(st.getId()+" "+st.getName()+" "+st.getEmail());
//		System.out.println(st.getSd().getAddress());
//		
		
		Std_details d = s.load(Std_details.class, 4);
		System.out.println(d.getAddress());
		System.out.println(d.getS().getName()+" "+d.getS().getEmail());
		
	}

}

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee1{

	public static void main(String[] args) {
		
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee("priti", 21, "pritivaghani@gmail.com"));
		a.add(new Employee("tarun", 12, "tarunvaghani@gmail.com"));
		a.add(new Employee("jemisha", 25, "jemishavaghani@gmail.com"));
		a.add(new Employee("hina", 50, "hinavaghani@gmail.com"));
		
		Collections.sort(a);
		
		Iterator<Employee> i = a.iterator();
		while(i.hasNext())
		{
//			System.out.println(i.next());
			Employee e = i.next();
			e.getdata();
		}
	}

}

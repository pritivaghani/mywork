package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student1 {

	public static void main(String[] args) {
		
		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(15,"priti", "java"));
		a.add(new Student(19,"pari", "nod"));
		a.add(new Student(21,"roshni", "cprogramming"));
		
//		Collections.sort(a,new Sortbyname_studentlist());
	Collections.sort(a,new Sortstudentby_sub());
		Iterator<Student> it = a.iterator();
		
		while (it.hasNext())
		{
			Student s = it.next();
			s.display();
			s.toString();
		}
	}

}

package collection;

import java.util.Comparator;

public class Sortstudentby_sub implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
	
		String sub = o1.sub;
		String sub1 = o2.sub;
		
		return sub.compareTo(sub1);
	}

	
}

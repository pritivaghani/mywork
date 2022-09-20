package collection;

import java.util.Comparator;

public class Sortbyname_studentlist implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		String name = o1.name;
		String name1 = o2.name;
		
		return -name.compareTo(name1);
	}


}

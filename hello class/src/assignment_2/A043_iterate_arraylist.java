package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A043_iterate_arraylist {

	public static void main(String[] args) {
	
		ArrayList<String> s = new ArrayList<>();
		s.add("java");
		s.add("node");
		s.add("c++");
		s.add("selenium");
		s.add("coding");
		
		Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

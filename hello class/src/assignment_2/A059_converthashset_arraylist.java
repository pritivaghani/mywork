package assignment_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class A059_converthashset_arraylist {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		h.add("java");
		h.add("node");
		h.add("selenium");
		h.add("computer");
		h.add("hardware");
		
		ArrayList<String> a = new ArrayList<>(h);
		
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
 
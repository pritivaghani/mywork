package assignment_2;

import java.util.HashSet;
import java.util.Iterator;

public class A051_iterate_hashset {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		h.add("movie");
		h.add("night");
		h.add("with");
		h.add("friends");
		
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
		   System.out.println(i.next());
		}
	}

}

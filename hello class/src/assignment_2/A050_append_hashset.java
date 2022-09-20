package assignment_2;

import java.util.HashSet;
import java.util.Iterator;

public class A050_append_hashset {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		h.add("monday");
		h.add("tuesday");
		h.add("wednesday");
		h.add("thrusday");
		h.add("friday");
		
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

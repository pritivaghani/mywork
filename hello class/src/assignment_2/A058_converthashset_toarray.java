package assignment_2;

import java.util.HashSet;
import java.util.Iterator;

public class A058_converthashset_toarray {

	public static void main(String[] args) {
	
		HashSet<String> h = new HashSet<>();
		h.add("monday");
		h.add("tuesday");
		h.add("wednesday");
		h.add("thrusday");
		h.add("friday");
		
		Iterator<String> i1 = h.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("+++++++++++++++++++++");
		
		
		String[] s = new String[h.size()];
		h.toArray(s);
		
		
		
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}

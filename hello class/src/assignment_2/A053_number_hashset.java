package assignment_2;

import java.util.HashSet;
import java.util.Iterator;

public class A053_number_hashset {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		h.add("music");
		h.add("dance");
		h.add("game");
		h.add("movie");
		h.add("party");
		h.add("drink");
		
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
             System.out.println(h.size());
	}

}

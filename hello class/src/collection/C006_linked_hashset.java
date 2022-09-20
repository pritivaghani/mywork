package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class C006_linked_hashset {

	public static void main(String[] args) {
//	does not allowed duplication;
//		initial size = 16;
//		load factor = 0.75;
//		store data in insertion manner;
		
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("gujarati");
		l.add("english");
		l.add("science");
		l.add("maths");
		l.add("computer");
		
		
		Iterator<String> it = l.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
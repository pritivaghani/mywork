package assignment_2;

import java.util.HashSet;
import java.util.Iterator;

public class A063_retainelement_hashset {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		h.add("java");
		h.add("node");
		h.add("c++");
		h.add("selenium");
		
		HashSet<String> h1 = new HashSet<>(h);
		h1.add("java");
		h1.add("selenium");
		h1.add("computer");
		h1.add("node");
		
		Iterator<String> i = h1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		h.retainAll(h1);
		

//		System.out.println(h.retainAll(h1));
//		System.out.println(h);
//		
//				Iterator<String> i = h1.iterator();
//				while(i.hasNext())
//				{
//					System.out.println(i.next());
//				}
	}

}

package assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class A025_reversearray {

	public static void main(String[] args) {
		
//		int p[] = {23,45,34,454,563,98,90,887};
//		
//		for (int i = p.length-1; i>=0; i--) {
//			System.out.println(p[i]);
//		}
//		
      
		
//		ArrayList<Integer> a = new ArrayList<>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
//		
//		Collections.reverse(a);
//	System.out.println(a);
		
		ArrayList<String> s = new ArrayList<>();
		s.add("orange");
		s.add("mango");
		s.add("grapes");
		s.add("apple");
		s.add("pineapple");
		
		Collections.reverse(s);
		
		Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
}
}
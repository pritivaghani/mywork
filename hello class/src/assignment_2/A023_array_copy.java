package assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class A023_array_copy {

	public static void main(String[] args) {
		
//		int a[] = {12,34,45,34,54,32,56,34,34};
//		int b[] = new int[9];
//		
//		for (int i = 0; i < b.length; i++) {
//			b[i] = a[i];
//			
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		
//		ArrayList<Integer> n = new ArrayList<>(a);
//		n.addAll(a);
//	
//		System.out.println(n);

		ArrayList<Integer> m = new ArrayList<>(a);
		m.add(10);
		m.add(20);
		m.add(30);
		

		
		Iterator<Integer> i = m.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

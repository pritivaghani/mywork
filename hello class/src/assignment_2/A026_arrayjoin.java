package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A026_arrayjoin {

	public static void main(String[] args) {
		
//		int a[] = {23,45,34,54,56,45};
//		int b[] = {45,23,67,76,56,56};
//		 
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.addAll(a);
		a2.addAll(a1);
		
		Iterator<Integer> i = a2.iterator();
		while(i.hasNext())

	{
			System.out.println(i.next());}
	}

}

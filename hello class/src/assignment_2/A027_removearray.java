package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A027_removearray {

	public static void main(String[] args) {
		
//		int a[] = {32,45,34,65,57,76,57};
//		
//		for (int i = 3; i < a.length-1; i++) {
//			a[i] = a[i+1];
//		}
//		
//		for (int i = 0; i < a.length-1; i++) {
//			System.out.println(a[i]);
//		}
//
//	}

		
		
		ArrayList< Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.remove(3);
		
		
		Iterator<Integer> it = ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

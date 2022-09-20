package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A061_increasesize_ofarray {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Iterator<Integer> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("********************");
		
		
		a.ensureCapacity(5);
		
		a.add(40);
		a.add(50);
		
		Iterator<Integer> i1 = a.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}

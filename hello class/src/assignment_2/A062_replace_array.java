package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A062_replace_array {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		a.set(2, 70);
		
		Iterator<Integer> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}

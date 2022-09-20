package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C002_arraylist {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(8237);
		al.add(9237);
		al.add(2973);
		
		ArrayList<Integer> it = new ArrayList<>(al);
		it.add(324);
		it.add(34);
		it.add(345);
		
		
		Iterator<Integer> it1 = it.iterator();
		while (it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
	}

}

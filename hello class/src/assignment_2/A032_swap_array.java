package assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class A032_swap_array {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("red");
		a.add("black");
		a.add("white");
		a.add("yellow");
		a.add("green");
		
		Collections.swap(a, 0, 2);
		
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

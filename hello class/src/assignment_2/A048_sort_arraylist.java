package assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class A048_sort_arraylist {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("red");
		a.add("white");
		a.add("black");
		a.add("yellow");
		a.add("green");
		
		Collections.sort(a);
		
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

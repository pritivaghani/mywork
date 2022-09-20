package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A046_update_arrayelement {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("yellow");
		a.add("red");
		a.add("green");
		a.add("blue");
		a.add("black");
		
		a.set(2, "white");
		
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

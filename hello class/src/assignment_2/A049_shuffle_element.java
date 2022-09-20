package assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class A049_shuffle_element {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("january");
		a.add("february");
		a.add("march");
		a.add("april");
		a.add("may");
		
		Collections.shuffle(a);
		
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}

}

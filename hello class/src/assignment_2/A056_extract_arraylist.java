package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A056_extract_arraylist {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("sita");
		a.add("radha");
		a.add("laxmi");
		a.add("urmila");
		a.add("rukamani");
		
		System.out.println(a.subList(0, 3));
		
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}

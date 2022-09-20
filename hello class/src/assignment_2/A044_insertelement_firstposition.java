package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A044_insertelement_firstposition {

	public static void main(String[] args) {
	
		ArrayList<String> a = new ArrayList<>();
		a.add("mom");
		a.add("dad");
		a.add("grandfather");
		a.add("grandmother");
		a.add("sister");
		a.add("brother");
		
		Iterator<String> s = a.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
		System.out.println("+++++++++++");
		
		a.add(0, "cousin");
		
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

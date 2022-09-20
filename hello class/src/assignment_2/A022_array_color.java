package assignment_2;

import java.util.ArrayList;
import java.util.Iterator;

public class A022_array_color {

	public static void main(String[] args) {
	
	ArrayList<String> a = new ArrayList<>();
	a.add("yellow");
	a.add("red");
	a.add("black");
	a.add("white");
	a.add("blue");
	
	
//	for (String s : a)
//	{
//		System.out.println(s);
//		}
	
	Iterator< String> i = a.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	}

}

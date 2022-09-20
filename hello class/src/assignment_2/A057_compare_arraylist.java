package assignment_2;

import java.util.ArrayList;

public class A057_compare_arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("java");
		a.add("node");
		a.add("selenium");
		a.add("hardware");
		a.add("networking");
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("java");
		a1.add("node");
		a1.add("selenium");
		a1.add("hardware");
		a1.add("networking");
		
		if(a.equals(a1) == true)
		{
			System.out.println("list are equals.");
		}
		else
		{
			System.out.println("list arenot equal");
		}
	}

}

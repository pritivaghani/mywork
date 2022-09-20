package assignment_2;

import java.util.ArrayList;

public class A047_search_element {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		if(a.contains(30))
		{
			System.out.println("is in arraylist");
		}
		else
		{
			System.out.println("is not in arraylist");
		}

	}

}

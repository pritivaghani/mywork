package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class C003_arraylist_nongeneric {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList<>();
		al.add("java");
		al.add(234);
		al.add(33.23);
		al.add('a');
		
	Iterator it = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
//	for(Object o : al)
//	{
//		System.out.println(o);
//	}
//	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Integer> al1 = new ArrayList<>();
	for (int i = 0; i < 5; i++) {
		 System.out.println("enter valiue: ");
	      al1.add(sc.nextInt());
	      
	}
	
	for (int s : al1)
	{
		System.out.println(s);
	}
	}

}
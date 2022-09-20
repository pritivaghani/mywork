package assignment_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A054_keyvalue_hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer , String> h = new HashMap<>();
		h.put(1,"pizza");
		h.put(2, "sandwich");
		h.put(3, "maggie");
		h.put(4, "dhosa");
		h.put(5,"pasta");
		
		Set s = h.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

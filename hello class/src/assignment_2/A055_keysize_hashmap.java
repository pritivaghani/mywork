package assignment_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A055_keysize_hashmap {

	public static void main(String[] args) {
	
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "krishna");
		h.put(2, "ram");
		h.put(3,"god");
		h.put(4, "hanuman");
		h.put(5, "brahma");
		h.put(6, "vishnu");
		
		 System.out.println(h.size());
		 
		Set s = h.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

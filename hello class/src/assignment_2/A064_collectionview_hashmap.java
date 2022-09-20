package assignment_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A064_collectionview_hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "bus");
		h.put(2, "car");
		h.put(3, "rikshow");
		h.put(4, "cycle");
		h.put(5, "truck");
		
		Set s = h.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
            System.out.println(h.values());
	}

}

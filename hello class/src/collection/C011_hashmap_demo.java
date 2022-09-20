package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class C011_hashmap_demo {

	public static void main(String[] args) {
	
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "priti");
		h.put(2, "jemi");
		h.put(3, "tarun");
		h.put(4, "Hina");
		
	System.out.println(h);
		System.out.println(h.get(3));
		
		Set s = h.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	for (Entry<Integer, String> e : h.entrySet())
	{
		System.out.println(e.getKey()+" "+e.getValue());
	}
	
	
		
	}
	
}



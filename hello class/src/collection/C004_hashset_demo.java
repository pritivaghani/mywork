package collection;

import java.util.HashSet;
import java.util.Iterator;

public class C004_hashset_demo {

	public static void main(String[] args) {
		
//		does not allowed duplication;
//		initial size 16;
//		load factor = 0.75;
//		store data in random manner;
		HashSet<String> h = new HashSet<String>();
		h.add("priti");
		h.add("parth");
		h.add("jemisha");
		h.add("tarun");
		h.add("hina");
		
		Iterator<String> it = h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}

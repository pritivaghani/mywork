package assignment_2;

import java.util.HashMap;

public class A060_hashmap_emtyornot {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h = new HashMap<>();
		
		System.out.println(h.isEmpty());
		
		
		h.put(1, "a");
		h.put(2, "b");
		h.put(3, "c");
		h.put(4, "d");
		h.put(5, "e");
		
		System.out.println(h.isEmpty());
		
	}

}

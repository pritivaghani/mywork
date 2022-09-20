package assignment_2;

import java.util.HashMap;

public class A028_frequentString_character {

	public static void main(String[] args) {
		
		 String name = "Successes";
		
		 HashMap<Character, Integer> h = new HashMap<>();
		 
		 
		     char ch[] = name.toCharArray();
		     for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[i]);
			}
	}

}

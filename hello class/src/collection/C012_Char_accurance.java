package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class C012_Char_accurance {

	public static void main(String[] args) {
		
		String name = "Hello java, Hello world, Hello node world";
		
	HashMap<Character, Integer> h = new HashMap<>();
	
	char ch[] = name.toCharArray();
	
	for (int i = 0; i < ch.length; i++) {
		if(h.get(ch[i]) == null)
		{
			h.put(ch[i], 1);
		}
		else
		{
			int p = h.get( ch[i]);
					p++;
			h.put(ch[i], p);
		}
	}
	
	for(Entry<Character, Integer> j : h.entrySet())
	{
		System.out.println(j.getKey()+" "+j.getValue());
		
	}
		
	}

}

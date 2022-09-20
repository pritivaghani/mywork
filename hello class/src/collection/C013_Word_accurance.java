package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class C013_Word_accurance {

	public static void main(String[] args) {
		String name = "My name is priti. I am learning a java.";
		
		HashMap<String, Integer> h = new HashMap<>();
		String words[] = name.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if(h.get( words[i]) == null)
			{
				h.put(words[i], 1);
			}
			else
			{
				int p = h.get(words[i]);
				p++;
				h.put(words[i], p);
			}
		}
		
		for (Entry<String, Integer> e : h.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
}
}
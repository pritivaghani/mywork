package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class C007_Treeset_demo {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>();
		t.add("india");
		t.add("japan");
		t.add("canada");
		t.add("USA");
		t.add("UK");
		
//		Iterator<String> it = t.iterator();

		Iterator<String> it = t.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

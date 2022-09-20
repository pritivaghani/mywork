package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_arraylist_demo {

	public static void main(String[] args) {

    ArrayList<String> al = new ArrayList<>();
    al.add("priti");
    al.add("dad");
    al.add("jemisha");
    al.add("mom");
   // al.addAll(al);
//    al.add(0, "jay");
//    al.set(2, "hina");
   // al.remove(0);
    //System.out.println(al.remove(2));
    al.set(2,"java");
    
    for (String s : al)
    {
    	System.out.println(s);
    }
    
//    Iterator<String> it = al.iterator();
//    
//    while(it.hasNext())
//    {
//    	System.out.println(it.next());
//    }
//   
		
		
	}
}

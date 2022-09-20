package collection;

import java.util.Enumeration;
import java.util.Vector;

public class C008_vectordemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.addElement("banana");
		v.addElement("apple");
        v.addElement("fruits");
        v.addElement("grapes");
        
        Enumeration<String> e = v.elements();
        
        while(e.hasMoreElements())
        {
        	System.out.println(e.nextElement());
        }
	}

}

package string;

public class Demo {

//	public static void main(String[] args) {
//		
//		String name = "Hello world";
//		String name1 = new String("Hello Java");
//		String s = name.concat("Hello Java");
//		
//		System.out.println(s);
//		
//		System.out.println(name+" "+name1);
//
//	}
//
//}
  
	public static void main(String[] args) {
		
		String s = "Priti";
		String s2 = "Tarun";
		String s3 = "Priti";
		
		System.out.println(s.equals(s2));
	    System.out.println(s.equals(s3));
	    System.out.println(s==s3);
	    
	    
	    
	    System.out.println("++++++++++++++++++++++++++");
	    
	    
	    String t = new String("Priti");
	    String t2 = new String("tarun");
	    String t3 = new String("Priti");
	    
	    System.out.println(t.equals(t2));
	    System.out.println(t.equals(t3));
	    System.out.println(t==t3);
	    
	}
		
		
	}
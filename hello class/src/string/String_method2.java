package string;

public class String_method2 {

	public static void main(String[] args) {
		String name = "Sun rises in east";
		
//	String ar[] = name.split(" ");
//		for (int i = 0; i < ar.length; i++) {
//		System.out.println(ar[i]);
//	}
//	System.out.println("Total words: " +ar.length);
//	}

      char ch[] = name.toCharArray();
      int count = 0; 
      for (int i = 0; i < ch.length; i++) {	 
		System.out.print(ch[i]+ " ");
	System.out.println(" ");
  if(ch[i]==' ')
   	   {
   		   count++;
   	   }
       }
   	   System.out.println("total space: "+count);
   	          System.out.println("++++++++++");


       byte b[] = name.getBytes();
    for (int i = 0; i < b.length; i++) {
	System.out.println(b[i]);
	}   
	}
}
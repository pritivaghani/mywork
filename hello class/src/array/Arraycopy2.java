package array;

public class Arraycopy2 {

//	public static void main(String[] args) {
//		int a[] = {10,32,34,44,345,456,6767,665,44};
//		int b[] = new int[8];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = a[i];
//			
//		}
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
//	}
//
//}
//         public static void main(String[] args) {
//	int p1[] = {12,46,36,56,66,54,43};
//	int p2[] = {23,55,55,43,334,565};
//	int b[] = new int[p1.length+p2.length];
//	
//	   for (int i = 0; i < p1.length; i++)
//	   {
//		b[i] = p1[i];
//	}
//	   for (int i = 0; i < p2.length; i++) 
//	   {
//		b[i] = p2[i];
//	}
//	  for (int i=0;i<b.length;i++)
//	  {
//		  System.out.println(b[i]);
//	  }
//		
//	}
//}
//	public static void main(String[] args) {
//		int j[] = {33,33,44,55,66,77,878,65};
//		int p[] = {22,56,77,65,443,22,33};
//		int jp[] = new int[j.length+p.length];
//		
//		for (int i = 0; i < j.length; i++) 
//		{
//			jp[i] = j[i];
//		}
//		for (int i = 0; i < p.length; i++)
//		{
//			jp[j.length+i] = p[i];
//		}
//		for (int i = 0; i < jp.length; i++)
//		{
//			System.out.println(jp[i]);
//			
//		}
//	}
		
          
         public static void main(String[] args) {
			int a1[] = {23,44,33,55,65,44,664,46,67};
			int a2[] = {56,66,56,86,69,67,60,66};
			int b[] = new int[a1.length+a2.length];
			 
			for (int i = 0; i < a1.length; i++) {
				b[i] = a1[i];
			}
			for (int i = 0; i < a2.length; i++) {
				b[a1.length+i] = a2[i];
			}
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
			}
		}    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
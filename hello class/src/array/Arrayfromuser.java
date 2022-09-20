
package array;

import java.util.Scanner;

public class Arrayfromuser {

//	public static void main(String[] args) {
//		
//	Scanner sc = new Scanner(System.in);
//		
//	System.out.println("enter a number: ");
//		int a[] = new int[5];
//		
//		for (int i=0;i<a.length;i++)
//		{
//			 System.out.println(a[i]);
//				
//		}
//		    
//		
//	}
//
//}
//    public static void main(String[] args)    {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("enter the size of a: ");
//    	int size = sc.nextInt();
//    	int a[] = new int[size];
//    	   for (int i=0;i<a.length;i++)
//    	   {
//    			System.out.println("Enter value for index  : "+i);
//    			a[i]  = sc.nextInt();
//    		}
//    		
//    		
//    		for (int i = 0; i < a.length; i++) {
//    			System.out.println(a[i]);
//    		}
//    		
//    		
//    	}
//    }
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		System.out.println("enter size: ");  
		 int size = sc.nextInt();
		   
		   int a[] = new int[size];
		   
		   for (int i = 0; i < a.length; i++) 
		   {
		    	  System.out.println("enter value of i: ");
		    	  a[i] = sc.nextInt();
		      }
		      
		   for (int i = 0; i < a.length; i++)
		   {
				System.out.println(a[i]);
		      }
		      
			}
		      
				
			}
		   
	
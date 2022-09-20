package impractical;

import java.util.Scanner;

public class Primenumbers {

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print(" Enter number : ");
//		int n = sc.nextInt();
//		
//		for (int j=3; j <= n; j++) 
//		{
//			int temp = 0;
//			
//			for (int i = 2; i <j ; i++)
//			{
//				if (j % i == 0)
//				{
//					temp = 1;
//					
//				}
//			}
//			
//			if (temp == 0) {
//				
//				System.out.println(j + "is prime ");
//
//			}else
//			{
//				System.out.println(j + "Not prime");
//			}
//		}
//
//	}
//}
     public static void main(String[] args)    {
    	 
    	 int a = 9; 
    	 int  temp = 0;
    	 for(int i=2;i<=a-1;i++)
    	 {
    		 if(a%i==0)
    		 {
    			temp=1; 
    		 }
    	 }
    	 if(temp==0)
    	 {
    		 System.out.println(a+ "prime number");
    	 }
    	 else
    	 {
    		 System.out.println(a+ "not prime number");
    	 }
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
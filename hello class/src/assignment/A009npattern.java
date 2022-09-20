package assignment;

import java.util.Scanner;

public class A009npattern {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the value of n: ");
//		int n = sc.nextInt();
//	
//	System.out.printf("%d + %d%d + %d%d%d" , n,n,n,n,n,n);
//	}
//}

  public static void main(String[] args) {
	
	   int n = 5;
	   int temp = n;
	   int sum = 0;
	   for (int i=0;i<3;i++)
	   {
		   sum = sum+n;
		   System.out.println(n);
           n = (n*10)+temp;
	   }
	  
	  System.out.println(sum);
  }  
}
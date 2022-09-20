package assignment;

import java.util.Scanner;

public class A003naturalnumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter value of n: ");
	int n = sc.nextInt();
	
		int i = 1;
		
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		
	}

}

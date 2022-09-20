package assignment_2;

import java.util.Scanner;

public class A015_division_operation {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
	    int b = sc.nextInt();
	    
	    try {
			System.out.println(a/b);
		}
	    catch (ArithmeticException e)
	    {
			e.printStackTrace();
		}
	    	
	}
	
}

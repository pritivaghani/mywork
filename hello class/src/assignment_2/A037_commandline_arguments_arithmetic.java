package assignment_2;

import java.util.Scanner;

public class A037_commandline_arguments_arithmetic {
          
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a num: ");
		int a = sc.nextInt();
		
		System.out.println("enter second num: ");
		int b = sc.nextInt();
		
		try
		{
			System.out.println(a/b);
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
	}

}
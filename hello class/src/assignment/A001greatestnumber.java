package assignment;

import java.util.Scanner;

public class A001greatestnumber {

	public static void main(String[] args) {
	 
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter a number: ");
	int num1 = sc.nextInt();
	
	System.out.println("Enter second number: ");
	int num2 = sc.nextInt();
	
	System.out.println("Enter third number: ");
	int num3 = sc.nextInt();
	
	
	int p = (num1>num2) ? (num1>num3)?num1:num3 : (num2>num3)?num2:num3;
	   System.out.println(p);
	

	}

}

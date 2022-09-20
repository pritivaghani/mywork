package assignment;

import java.util.Scanner;

public class A004sumaverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.println("enter third number: ");
		int c = sc.nextInt();
		
		System.out.println("enter forth number: ");
		int d = sc.nextInt();
		
		System.out.println("Enter fifth number: ");
		int e = sc.nextInt();
		
		int sum = 0;
		
		for(int i=a;i<=e;i++)
		{
			sum = a+b+c+d+e;
			
		}
		System.out.println("total: "+sum);
		System.out.println("average: "+sum/5);
			
		}
	
	}


package exception;

import java.util.Scanner;

class Age 
{
	
	public void display(int age) throws Myownexception  
	{
		if (age<18)
		{
		   throw new Myownexception();
		}
		else
		{
			System.out.println("valid age..");
		}
	}
}
public class E004_custom1_exception
{

	public static void main(String[] args) {
		
		
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter an age: ");
	   int age = sc.nextInt();
	   
	   Age a = new Age();
	   try {
		a.display(age);
	} 
	   catch (Myownexception e) 
	   {
		e.printStackTrace();
		e.getdata();
	}
	  
	}

}

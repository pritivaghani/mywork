package assignment_2;

import java.util.Scanner;
class Arithmeticexception extends Exception
{
	
}
class Age
{
	public void getage(int age) throws Arithmeticexception
	{
		if (age<18)
		{
			throw new Arithmeticexception();
		}
		else
		{
		System.out.println("Welcome to vote.");
	}
}
}
public class A018_age_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    Age a = new Age();
    System.out.println("Enter an age: ");
    try {
		a.getage(sc.nextInt());
	}
    catch (Arithmeticexception e) 
    {
		e.printStackTrace();
	}
	}

}

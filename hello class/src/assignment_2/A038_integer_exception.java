package assignment_2;

import java.util.Scanner;

class NumbernotvalidException extends Exception
{
	
}
class Number
{
	public void getnum(int num) throws NumbernotvalidException
	{
		if(num<10 || num>40)
		{
			throw new NumbernotvalidException();
		}
		else
		{
			System.out.println(num);
		}
	}

	
}

public class A038_integer_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
   Number n = new Number();
   System.out.println("Enter a number: ");
   
   try {
	n.getnum(sc.nextInt());
} catch (NumbernotvalidException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}

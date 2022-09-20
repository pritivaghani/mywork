package assignment_2;

import java.util.Scanner;

class Account
{
	int balance = 2000;
	
	public void withdraw( int amount) throws Customexception
	{
	if (amount>balance)
	{
		throw new Customexception();
	}
	else
	{
		System.out.println(balance = balance  - amount);;
	}
	}
}
public class A019_account_balance_exception {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		Account a = new Account();
	System.out.println("enter a amount: ");
	try
	{
		a.withdraw(sc.nextInt());
	} 
	catch (Customexception e) 
	{
		e.printStackTrace();
	}
	}

}

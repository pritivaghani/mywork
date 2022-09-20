package thread;

import java.util.Scanner;

class Account
{
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	boolean isExit(double amt)
	{
		boolean b = false;
		if(amt>balance)
		{
			b = false;
		}
		else
		{
			b = true;
		}
		return b;
	}
	public void widrow(double amt ,String name)
	{
		balance = balance - amt;
		System.out.println("account widrow by :"+name+ " +and current account balance: "+balance);
	}
}

class Customer implements Runnable
{
	String name;
	Account account;
	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}
	
	public void run()
	{
		synchronized (account) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter amount: " +name);
			double amt = sc.nextDouble();
			
			if(account.isExit(amt))
			{
				account.widrow(amt, name);
			}
			else
			{
				System.out.println("insufficeint balance..");
			}
		}
	}
}
public class T004_syncdemo {

	public static void main(String[] args) {
		Account a = new Account(5000);
		
		Customer c = new Customer("Priti", a);
		Customer c1 = new Customer("jay", a);
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c1);
		
		t1.start();
		t2.start();
		
		
	}

}

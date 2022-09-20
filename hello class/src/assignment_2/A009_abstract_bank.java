package assignment_2;

abstract class Bank
{
	public abstract void getbalance();
}

class BankA extends Bank
{
	public void getbalance()
	{
		int deposite = 100;
		System.out.println(deposite);
	}
}

class BankB extends Bank
{
	public void getbalance()
	{
		int deposite = 150;
		System.out.println(deposite);
	}
}

class BankC extends Bank
{
	public void getbalance()
	{
		int deposite = 200;
		System.out.println(deposite);
	}
}
public class A009_abstract_bank {

	public static void main(String[] args) {
	
		BankA b = new BankA();
		b.getbalance();
		
		BankB b2 = new BankB();
		b2.getbalance();
		
		BankC b3 = new BankC();
		b3.getbalance();
	}

}

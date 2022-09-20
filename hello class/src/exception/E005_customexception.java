package exception;

class Bank
{
	double balance;
	public void getbalance()
	{
		System.out.println("Current balance: "+balance);
	}
		public void deposite(double amt)
	{
		balance = balance + amt;
	}
	
	public void withdrow(double amt)  throws Bank_exception
	{
		if(amt>balance)		{
			throw new Bank_exception();		}
		else
		{
			balance = balance - amt;		}
	}
}

public class E005_customexception {

	public static void main(String[] args) {
				Bank b = new Bank();
		b.getbalance();
		b.deposite(9000);
		
		b.getbalance();
		
		try {
			b.withdrow(12000);
		} catch (Bank_exception e)
		{
			e.printStackTrace();
			e.msg();
		}
			b.getbalance();
		}
}


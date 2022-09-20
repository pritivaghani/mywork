package assignment_2;

class Data1 extends Thread
{
	public void run()
	{
		for (int i = 1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
}


public class A042_Twice_thread {

	public static void main(String[] args) {
		
		
		Data1 d = new Data1();
	   d.start();
	   d.start();
		
		
	}

}

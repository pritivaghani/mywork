package assignment_2;

class Data extends Thread
{
	public void run()
	{
		for(int i = 1 ;i<=15; i++)
		{
			System.out.println(i);
		}
	}
}


public class A040_thread1 {

	public static void main(String[] args) {
	
       Data d = new Data();
       d.start();
	}

}

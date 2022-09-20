package assignment_2;

class Ab extends Thread
{
	public void run()
	{
	for(int i = 1; i<=10; i++)
	{
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1: "+i);
	}
}
}

class Ba extends Thread
{
	public void run()
	{
	for(int i = 1; i<=10; i++)
	{
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2: " +i);
	}
}
}
public class A041_sleep_thread {

	public static void main(String[] args) {
	
		Ab a = new Ab();
		a.start();
		
		Ba b = new Ba();
		b.start();
	}

}

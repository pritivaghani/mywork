package thread;

class T1 implements Runnable
{
	public void run()
	{
		for (int i = 0; i <= 10; i++) {
			System.out.println("T1: "+i);
		}
	}
}

class T2 implements Runnable
{
	public void run()
	{
		for (int i = 0; i <= 10; i++) {
			System.out.println("T2: "+i);
		}
	}
}


public class T002_Runnable_thread {

	public static void main(String[] args) {
		
		
		T1 t = new T1();
		T2 t1 = new T2();
		
		Thread th = new Thread(t);
		Thread th1 = new Thread(t1);
		
		th.start();
		th1.start();
	}

}

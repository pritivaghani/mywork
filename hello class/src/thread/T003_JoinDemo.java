package thread;

class Join extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 3; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread().getName()+" : " +i);
		}
	}
}

public class T003_JoinDemo {

	public static void main(String[] args) 
	{
		Join j = new Join();
		Join j1 = new Join();
		Join j2 = new Join();
		
		j.start();
		try {
			j.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		j2.start();
			
			
	}

}

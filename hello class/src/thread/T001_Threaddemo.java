package thread;

class Th1 extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 10; i++) {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
			System.out.println("Th1: " +i);
		}
	}
}

class Th2 extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 10; i++) {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
			System.out.println("Th2: " +i);
		}
	}
}
public class T001_Threaddemo {

	public static void main(String[] args) throws InterruptedException
	{
		Th1 t = new Th1();
		Th2 t1 = new Th2();
//		
//         t.run();
//         t1.run();
		
		t.start();
		t1.start();
		
		t.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(t.getPriority()+" "+t1.getPriority());
		
		t.setName("Priti");
		t1.setName("Tarun");
		
		System.out.println(t.getName()+" "+t1.getName());
		
		System.out.println(t.getId()+" "+t1.getId());
	}

}

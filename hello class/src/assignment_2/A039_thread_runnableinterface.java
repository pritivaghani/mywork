package assignment_2;

import loop.Forloop;

class Th implements Runnable
{
	public void run()
	{
	for(int i = 1; i<=10; i++)
	{
		System.out.println(i);
	}
}
}
public class A039_thread_runnableinterface {

	public static void main(String[] args) {
		
	Th t = new Th();
    
	Thread t1 = new Thread(t);
	t1.start();

}

}
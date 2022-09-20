package assignment_2;

class Java extends Thread
{
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println("number: " +i);
		}
	}
}

public class A052_setname_priority {

	public static void main(String[] args) {
	Java j = new Java();
	Java j1 = new Java();
		
		j.setName("mythread-1");
		j1.setName("mythread-2");
		
		System.out.println(j.getName()+" "+j1.getName());
		
		j.setPriority(Thread.MIN_PRIORITY);
		j1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(j.getPriority()+" "+j1.getPriority());
		
		j.start();
		j1.start();
	}

}

package thread;

class Calc
{
     synchronized public void mul(int n)
     {
    	 for (int i = 1; i < 5; i++) {
    		 Thread t = Thread.currentThread();
    		 System.out.println(t.getName()+" : "+i*n);
		}
     }
}

class Mythread extends Thread
{
	Calc  c;

	public Mythread(Calc c) {
		super();
		this.c = c;
	}
	
	public void run()
	{
		c.mul(5);
	}
	
}
public class T005_methodsync {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		Mythread m = new Mythread(c);
		Mythread m1 = new Mythread(c);
		Mythread m2 = new Mythread(c);
		
		m.setName("A");
		m1.setName("B");
		m2.setName("C");
		
		m.start();
		m1.start();
		m2.start();
		}

}

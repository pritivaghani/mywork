package keywords;

class Demo
{
	public Demo()
	{
		System.out.println("Riding a car on road...");
	}
	
	static
	{
		System.out.println("Calling a static demo method...");
	}
	
	static class MyDemo
	{
		public void run()
		{
		System.out.println("Display riunning....");
		
	}
		
		public static void display()
		{
			System.out.println("Static void method running...");
		}
	}
}
public class Static_block {
	
	static
	{
		System.out.println("Running static method....");
	}

	public static void main(String[] args) {
		
		 Demo d = new Demo();
	     Demo.MyDemo m = new Demo.MyDemo();
	     m.run();
//	     m.display();
	     System.out.println("Display an animal movie....");
	{
		System.out.println("Running a non- static method....");
	}
	   Demo.MyDemo.display();
	}
}

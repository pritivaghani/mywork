package keywords;

class Sample 
{
	
	int a = 50;
	  
	public void display()
	{
		System.out.println(a);
	}
	
	public void run()
	{
		System.out.println("this is a Sample class method running...");
	}
}






class Tarun   extends Sample
{
	int a;
	Tarun(int a)
	{
		this.a = a;
	}
	
	public void display()
	{
		System.out.println("Display method running on screen...");
	}
	
	public void run()
	{
		System.out.println(a);
		System.out.println(super.a);
		System.out.println("This is a running method...");
		this.display();
		super.run();
	}
}




public class This_demo {

	public static void main(String[] args) {
		
		Tarun t = new Tarun(234);
		t.run();
		

	}

}

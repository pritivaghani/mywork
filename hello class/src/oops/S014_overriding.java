package oops;

class Om
{
	public void display()
	{
		System.out.println("Watching a movie....");
	}
}

class Sai extends Om
{
	public void display()
	{
		System.out.println("Running display method on screen.....");
		super.display();
	}
}



public class S014_overriding {

	public static void main(String[] args) {
		
		Sai s= new Sai();
		s.display();
	}

}


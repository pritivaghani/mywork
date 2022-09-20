package oops;

class Page
{
	public void towrite()
	{
		System.out.println("writing a book.....");
	}
}
class Pen
{
	Page a = new Page();
	public void display()
	{
		System.out.println("Display a data....");
	}
}






public class Aggrigation {

	public static void main(String[] args) {
		
		Pen p = new Pen();
		p.display();
		p.a.towrite();		
	}

}

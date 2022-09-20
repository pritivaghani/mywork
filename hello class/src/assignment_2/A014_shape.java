package assignment_2;

class Shape1
{
	public void display()
	{
		System.out.println("This is this is shape.");
	}
}

class Rectangle1 extends Shape1
{
	public void towrite()
 {
		System.out.println("This is rectangular shape.");
	}
}

class Circle extends Shape1
{
	public void getdata()
	{
		System.out.println("This is circular shape.");
	}
}

class Square1 extends Rectangle1
{
	Rectangle1 r = new Rectangle1();
	Shape1 h = new Shape1();
	public void toread()
	{
		
		System.out.println("Square is a rectangle.");
	}
}
public class A014_shape {

	public static void main(String[] args) {
		
         Square1 s = new Square1();
         s.toread();
         s.h.display();
         s.r.towrite();
         
	}

}


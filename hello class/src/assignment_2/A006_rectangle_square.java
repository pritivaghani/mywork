package assignment_2;
  
class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area()
	{
		double area = length*breadth;
		System.out.println("area of rectangle: " +area);
	}
	
	public void perimeter()
	{
		double perimeter = 2*(length+breadth);
		System.out.println("perimeter of rectagle: " +perimeter);
	}
}

class Square extends Rectangle
{
	Square(int length)
	{
		super(length, length);
	}
	
	public void getarea()
	{
		double area = length*length;
		System.out.println("Area of square: " +area);
	}
	
	public void getperimeter()
	{
		double perimeter = 4*length;
		System.out.println("Perimeter of squrea: " +perimeter);
	}
	
}


public class A006_rectangle_square {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(200,220);
		r.area();
		
		Rectangle r2 = new Rectangle(100,100);
		r2.perimeter();
		
		Square s = new Square(400);
		s.getarea();
		  
		Square s2 = new Square(400);
		s2.getperimeter();
	}

}

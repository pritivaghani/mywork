package oops;

class Shape
{
	public void getarea()
	{
		
	}
}

class Triangle extends Shape
{
	int h;
	int l;
	Triangle (int h, int l)
	{
		super();
		this.h = h;
		this.l = l;
	}
	public void getarea()
	{
		double area = 1%2*h*l;
		
	    System.out.println("Area of triangle: " +area);
	}
}

class Square extends Shape
{
	int l;
	
	Square(int l)
	{
		this.l = l;
	}
	public void getarea()
	{
		double area = l*l;
		System.out.println("Area of square: " +area);
		
	}
}

class Circle extends Shape
{
	int r;
	
	Circle(int r)
	{
		this.r = r;
	}
	public void getarea()
	{
		double area = 3.14*r*r;
		System.out.println("Area of circle: "+area);
	}
	
}


public class S015_area {

	public static void main(String[] args) {
		Circle c = new Circle(20);
		c.getarea();
		
		Square s = new Square(300);
		s.getarea();
		
		Triangle t = new Triangle(15,15);
		t.getarea();
	}

}

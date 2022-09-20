package assignment_2;

abstract class Shape
{
	public abstract void rectanglearea(int length, int breadth);
	public abstract void squarearea(int sides);
	public abstract void circlearea(int radius);
}

class Area1 extends Shape
{
	
	
	public void rectanglearea(int length , int breadth)
	{
		double area = length*breadth;
		System.out.println("Area of rectangle: " +area);
	}
	
	public void squarearea(int sides)
	{
		
		double area = sides*sides;
		System.out.println("Area of square: " +area);
	}
	
	public void circlearea(int radius)
	{
		
		double area = 3.14*radius*radius;
		System.out.println("Area of circle: " +area);
	}
}


public class A012_abstract_shape {

	public static void main(String[] args) {
		
		Area1 a = new Area1();
		a.rectanglearea(40,20);
		
		Area1 a2 = new Area1();
		a2.squarearea(4);
		
		Area1 a3 = new Area1();
		a3.circlearea(20);
	}

}

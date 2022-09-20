package assignment_2;

class Triangle
{
	int a = 3;
	int b = 4;
	int c = 5;
	
	
	Triangle()
	{
		
	}
	
	public void area()
	{
		double area = 1%2*a*b*c;
		System.out.println("Area of triangle: " +area);
	}

	public void perimeter()
	{
		 double perimeter = a+b+c;
		 System.out.println("Perimeter of triangle: " +perimeter);
	}
		
	}



public class A007_Triangle {

	public static void main(String[] args) {
	
		 Triangle t = new Triangle();
		 t.area();
		 t.perimeter();
	}

}
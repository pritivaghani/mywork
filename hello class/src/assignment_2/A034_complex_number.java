package assignment_2;

class Complexnumber
{
	int real;
	int imagery;
	
	public Complexnumber(int real , int imagery) {
		this.real = real;
		this.imagery = imagery;
	}
	
	public void display()
	{
		System.out.println(real+" "+imagery);
	}
	
	public static Complexnumber add(Complexnumber c, Complexnumber c1)
	{
		Complexnumber c2 = new Complexnumber(0, 0);
		c2.real = c.real + c1.real;
		c2.imagery = c.imagery + c1.imagery;
		return c2;
	}
}
public class A034_complex_number {

	public static void main(String[] args) {
		Complexnumber c = new Complexnumber(2, 5);
		Complexnumber c1 = new Complexnumber(3, 67);
		c.display();
		c1.display();
		
		Complexnumber result = Complexnumber.add(c, c1);
		result.display();
	}

}

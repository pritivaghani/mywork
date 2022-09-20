package oops;
 
class Board
{
	public void simple(int...a)
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void display(int...b)
	{
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	
}







public class Variablearguments {

	public static void main(String[] args) {
		Board b = new Board();
		b.simple(23,43,54,34,35);

		b.display(23,34,54,13,43,324,23);
	}

}

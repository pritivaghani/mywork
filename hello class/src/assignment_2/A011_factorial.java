package assignment_2;

class Factorial
{
	int n = 4;
	int fact = 1;
	
	public void factorial()
	{
	  fact = 4*3*2*1;
		System.out.println("4! = 4*3*2*1= " +fact);
	}
}



public class A011_factorial {

	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		f.factorial();

	}
}


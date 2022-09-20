package oops;

class Exam
{
	public void display()
	{
		System.out.println("Writting a method .....");
	}

    public void add(int a, int b)
    {
    	int result = a+b;
    	System.out.println(result);
    }

}
public class S004Method1 {

	public static void main(String[] args) {
		Exam ex = new Exam();
		ex.display();
		
	     ex.add(12, 32);
	     ex.add(12, 23);
	     ex.add(50, 50);
	}

}

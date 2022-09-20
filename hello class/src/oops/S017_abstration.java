package oops;
//
//import com.sun.jdi.Method;
//
//abstract class Java
//{
//	public abstract void display();
//	
//	public void towrite()
//	{
//		System.out.println("Running a display Method...");
//	}
//}
//
//class Java2  extends Java
//{
//	public void display()
//	{
//		System.out.println("Writing a book to read that in free time...");
//	}
//}
//
//
//
//public class S017_abstration {
//
//	public static void main(String[] args) {
//	
//		Java2 j = new Java2();
//		j.display();
//	    j.towrite();
//	}
//
//}


abstract class Priti
{
	public abstract void display();
	
	public void voice()
	{
		System.out.println("Eating a apple....");
	}
}

class Priti2  extends Priti
{
	public void display()
	{
		System.out.println("Writing a book by pen...");
	}
}

public class S017_abstration { 

    public static void main(String[] arga)
    {
    	Priti2 p = new Priti2();
         p.display();
         p.voice();
}
}






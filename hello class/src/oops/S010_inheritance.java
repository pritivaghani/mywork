package oops;

class P
{
	int a = 20;
	
	public void display()
	{
		System.out.println("Writing a book ....");
	}
}

class J  extends P
{
	int a = 12;
	
	public void towrite()
	{
		System.out.println(a);
		System.out.println(super.a);
	      System.out.println("Running a run method....");
	}
      public void display()
      {
    	  System.out.println("Reading a book...");
           super.display();
      }
      
}

class JP extends P
{
	
}


public class S010_inheritance {

	public static void main(String[] args) {
		
		P p = new P();
		p.display();
		
		J j = new J();
		j.display();
		j.towrite();
		j.display();
		
		JP jp = new JP();
		jp.display();
	}

}

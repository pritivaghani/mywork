package oops;

class A
{   int d = 50;

	public void towrite() {
		System.out.println("writing a book.....");
	}
}


class B   extends A
{  int d = 60;

      public void display()
      {
    	  System.out.println(d);
    	  System.out.println(super.d);
      }
	
      public void getdata()
      {
    	  System.out.println("reading a book....");
    	  super.towrite();
      }
}

class AB extends B
{
	
}



public class S011_inheritance2 {

	public static void main(String[] args) {
		
		A a = new A();
		a.towrite();
		
		B b = new B();
		b.towrite();
		b.display();
		b.getdata();
		
		AB ab = new AB();
		ab.getdata();
		ab.display();
	}

}

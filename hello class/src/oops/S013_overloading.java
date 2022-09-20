package oops;

  class Calculation
  {
	  public void add(int a , int b)
	  {
		  int r = a+b;
		  System.out.println(r);
	  }
	  
	  public void add(int a , int b, int c)
	  {
		  int p = a+b+c;
		  System.out.println(p);
	  }
	  
	  public void add(double a, int b)
	  {
		  double d = a+b;
		  System.out.println(d);
	  }
  }




public class S013_overloading {

	public static void main(String[] args) {
		
		Calculation c = new Calculation();
		c.add(20, 20);
		c.add(10, 20, 30);
		c.add(10.22, 10);
	}

}

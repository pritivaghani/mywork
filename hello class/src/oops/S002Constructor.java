package oops;

class Boy
{
	int weight;
	String name;
	String colour;
	
	Boy(int a, String b, String c)
	{
		weight = a;
		name = b;
		colour = c;
	}
	
	  public void display()
	  {
		  System.out.println(weight+" "+name+" "+colour);
	  }
}

public class S002Constructor {

	public static void main(String[] args) {
		
       Boy b1 = new Boy(60,"jay","white");
       b1.display();
       
      
	}

}

package assignment_2;

class Area 
{
	int l;
	int b;

   
     Area(int l)
     {
    	 this.l = l;
     }
     
     Area(int l,int b)
     {
    	 this.l = l;
    	 this.b = b;
     }
       
     public void getarea()
     {
    	 double area = l*l;
    	   System.out.println("Area of square: " +area);
     }
      
     public void area()
     {
    	 double area = l*b;
    	 System.out.println("Area of rectangle: " +area);
     }
}



public class A003_square_rectangle {

	public static void main(String[] args) {
		
       Area a = new Area(200);
       a.getarea();
       
       Area a2 = new Area(200,400);
       a2.area();
	}

}

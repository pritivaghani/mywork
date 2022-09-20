package oops;
//
//interface Tops
//{
//	public void display();
//	
//}
//interface Tops2
//{
//	public static final int a = 10;
//	public void display();
//	public void run();
//	
//}
//	
//class Demo
//{
//	
//}
//
//class Demo2 extends Demo implements Tops,Tops2
//{
//	public void display()
//	{
//		System.out.println("walking in the garden at late night...");
//		System.out.println(a);
//	}
//	
//	public void run()
//	{
//		System.out.println("writing a paper in classroom...");
//	}
//}
//
//
//
//public class S018_interface {
//
//	public static void main(String[] args) {
//		Demo2 d = new Demo2();
//		d.display();
//		d.run();
//		
//	}
//


   interface Joy
   {
	   public void display();
	   
   }
 
   interface Joy2
   {
	   public void run();
	   public void display();
	   public static final int a = 20;
	   
   }
 
   class K
   {
	   
   }


   class K2 extends K implements Joy,Joy2
   {
	   public void display()
	   {
		   System.out.println("Learning a core java...");
	   }
	   
	   public void run()
	   {
		   System.out.println("Reading a book...");
		   System.out.println(a);
	   }
   }

   public class S018_interface {
	   public static void main(String[] args) {
		
		   K2 k = new K2();
		   k.display();
		   k.run();
	}   }















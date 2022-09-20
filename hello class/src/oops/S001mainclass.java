package oops;

//
//    class Pencile
//    {
//    	int price = 10;
//       String colour = "blue";
//      String company = "artline";
//         
//    
//       public void towritten()
//       {
//    	   System.out.println(price+" "+colour+" "+company);
//       }
//    }
//    public class S001mainclass {
//    	    
//    public static void main(String[] args) {
//		   Pencile p1 = new Pencile();
//		   p1.colour = "red";
//		   p1.towritten();
//		   
//		   Pencile p2 = new Pencile();
//		   p2.company = "apsara";
//		   p2.towritten();
//	}
//
//}
     
class Movie
{
     int budget = 2300;
     String name = "omg";
    static String hero = "salmankhan";
     
       public void display()
       {
    	   System.out.println(budget+" "+name+" "+hero);
       }
       public static void towrite()
       {
    	   System.out.println("Display writing....");
       }
}
public class S001mainclass {
	public static void main(String[] args) {
		
		Movie.hero = "dhoni";
		
		Movie m = new Movie();
		m.hero = "amir";
		m.display();
		
		Movie m1 = new Movie();
		m1.name = "raj";
		m1.display();
		
		Movie.towrite();
	}
}


























package oops;

class Book
{
	int price;
	String name;
	int page;
	
	Book()
	{
		System.out.println("reading a book.....");
	}
//     Book(int a, String b, int c)
//     {
//    	 price = a;
//    	 name = b;
//    	 page = c;
//     }
	
	Book(String a)
	{
		name = a;
	}
	
	Book (int price, String name, int page)
	{
		this.price = price;
		this.name = name;
		this.page = page;
	}
	
	
	
	
	
	
	
	public void display()
	  {
		  System.out.println(price+" "+name+" "+page);
	  }
}



public class S003Constructor2 {

	public static void main(String[] args) {
		Book b = new Book();
		b.display();

		Book b1 = new Book(1000,"science",300);
		b1.display();
		
		Book b2 = new Book(500,"english",200);
		b2.display();
		
		Book b3 = new Book("gujarati");
		b3.display();
		
		Book b4 = new Book(2000,"maths",500);
		b4.display();
	}

}

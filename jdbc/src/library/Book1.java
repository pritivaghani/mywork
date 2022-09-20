package library;

import java.util.Scanner;

public class Book1 {

	public static void main(String[] args) {
  int choice = 0;
		do {
	     Scanner sc = new Scanner(System.in);
		System.out.println("enter choice: ");
		
		System.out.println("0 : exit");
		System.out.println("1 : add book");
		System.out.println("2 : view book");
		System.out.println("3 : delete book");
		System.out.println("4 : issue book");
		Book1_operation b = new Book1_operation();
		
		 choice = sc.nextInt();
		
		switch (choice) 
		{
		case 0:
			System.out.println("you are exit...");
			break;
			
		case 1:
			b.addbook();
			break;
			
		case 2:
			b.viewbook();
			break;
			
		case 3:
			b.deletebook();
			break;
			
		case 4:
			b.issuebook();
			break;
			
			

		default:
			System.out.println("invalid choice...");
			break;
		}

	}while(choice != 0);

}
}
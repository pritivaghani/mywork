package library;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
	
	int choice =0;
	do {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice: ");
		
		System.out.println("0 : exit");
		System.out.println("1 : add book");
		System.out.println("2 : view book");
		System.out.println("3 : delete book");
		System.out.println("4 : issue book");
		Library_operation l = new Library_operation();
		
		 choice = sc.nextInt();
		
		switch (choice) {
		case 0:
			System.out.println("you are exit....");
			break;
		case 1:
		    l.addbook();
			break;
			
		case 2:
			l.viewbook();
			break;
			
		case 3:
			l.deletebook();
			break;
			
		case 4:
			l.issuebook();
			break;

		default:
			System.out.println("invalid choice");
			break;
		}
		
	}
	while(choice!=0);
	}
	
	
}

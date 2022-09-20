package library;

import java.util.Scanner;

public class Fruit {

	public static void main(String[] args) {
		
		int choice = 0;
do
{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice: ");
		
		System.out.println("0 : exit");
		System.out.println("1 : addfruit");
		System.out.println("2 : viewfruit");
		System.out.println("3 : deletefruit");
		System.out.println("4 : issuefruit");
		
		Fruit_operation f = new Fruit_operation();
		
		 choice = sc.nextInt();
		
		switch (choice) {
		case 0:
			System.out.println("you are exit...");
			break;
			
		case 1:
			f.addfruit();
			break;
			
		case 2:
			f.viewfruit();
			break;
			
		case 3:
			f.deletefruit();
			break;
			
		case 4:
			f.issuefruit();
			break;
			

		default:
			System.out.println("invalid choice...");
			break;
		}
	}while(choice != 0);
	}
}

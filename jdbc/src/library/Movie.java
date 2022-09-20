package library;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		
		int choice =0;
	
		do {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your choice: ");
		System.out.println("0 : exit");
		System.out.println("1 : addmovie");
		System.out.println("2 : viewmovie");
		System.out.println("3 : deletemovie");
		System.out.println("4 : issuemovie");
		Movie_operation m = new Movie_operation();
		
		 choice = sc.nextInt();
		
		switch (choice) {
		case 0:
             System.out.println("you are exit..");			
			break;
			
		case 1:
			m.addmovie();
			break;
			
		case 2:
			m.viewmovie();
			break;
			
		case 3:
			m.deletemovie();
			break;
			
		case 4:
			m.issuemovie();
			break;

		default:
			System.out.println("invalid choice...");
			break;
		}
	}while(choice !=0);
}

}

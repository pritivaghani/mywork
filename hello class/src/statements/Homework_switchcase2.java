package statements;

import java.util.Scanner;

public class Homework_switchcase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
	
		
	    System.out.println("enter 1 for addition: ");
	    System.out.println("enter 2 for subtraction: ");
	    System.out.println("enter 3 for division: ");
	    System.out.println("enter 4 for remainder: ");
	    int calculater = sc.nextInt();
	    
	    switch(calculater)
	    		
	    {
	    case 1:
	    	System.out.println("addition: "+(a+b));
	    	break;
	    	
	    case 2:
	    	System.out.println("subtraction:" +(a-b));
	    	break;
	    	
	    case 3:
	    	System.out.println("division: "+(a/b));
	    	break;
	    	
	    case 4:
	    	System.out.println("remainder: "+(a%b));
            break;
	    }   
	       
	    }
	    
	    }
	    
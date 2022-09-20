package assignment_2;

import java.util.Scanner;

public class A016_multiplecatch_book {

	public static void main(String[] args) {
		
    try 
    {
    	int a = 20;
		int b = a/0;
		
		int p[] = new int[5];
		p[5] = 30/0;
	} 
    catch(ArithmeticException e)
    {
		e.printStackTrace();
	}
    catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
  
     
     
     
     

}
}
package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E001_output1_stream {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter email: ");
		String email = sc.next();
		
		try 
		{
			FileOutputStream fo = new FileOutputStream("C:\\Users\\Himlay\\eclipse-workspace\\"+name+".txt");
			byte b[] = email.getBytes();
			fo.write(b);
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
				
				

	}

}

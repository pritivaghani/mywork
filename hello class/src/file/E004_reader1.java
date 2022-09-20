package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E004_reader1 {

	public static void main(String[] args) {
		
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Himlay\\eclipse-workspace\\jay.txt");
			int i = fr.read();
			
			while(i != -1)
			{
				char c = (char) i;
				System.out.println(c);
				i = fr.read();
			}
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		

	}

}

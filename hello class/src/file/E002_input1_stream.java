package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E002_input1_stream {

	public static void main(String[] args) {
		
		FileInputStream fi = null;
	
		try
		{
			fi = new FileInputStream("C:\\Users\\Himlay\\eclipse-workspace\\god.txt");
			int i = fi.read();
			
			while(i != -1)
			{
				char c = (char) i;
				System.out.println(c);
				i = fi.read();
			}
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		finally {
			try
			{
				fi.close();
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
		
		
	}

}

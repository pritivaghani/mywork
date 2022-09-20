package file;

import java.io.FileInputStream;
import java.io.IOException;

public class E006_input_stream {

	public static void main(String[] args) {
		
		FileInputStream fo; 
		
		try {
			 fo = new FileInputStream("C:\\Users\\Himlay\\eclipse-workspace\\name.txt");
			int i = fo.read();
			
			while(i!=-1)
			{
				char c = (char) i;
				System.out.println(c);
				i = fo.read();
				
			}
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
        
		}
	}



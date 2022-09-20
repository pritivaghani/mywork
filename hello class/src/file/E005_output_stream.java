package file;

import java.io.FileOutputStream;
import java.io.IOException;

public class E005_output_stream {

	public static void main(String[] args) {
	
		try 
		{
			FileOutputStream fo = new FileOutputStream("C:\\Users\\Himlay\\eclipse-workspace\\name.txt");
			System.out.println("file craeted....");
			String data = "this is my frist practical";
			byte b[]= data.getBytes();
			fo.write(b);
			
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	
		
	}

}

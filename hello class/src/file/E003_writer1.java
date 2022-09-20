package file;

import java.io.FileWriter;
import java.io.IOException;

public class E003_writer1 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Himlay\\eclipse-workspace\\jay.txt");
			String name = "Watching a movie at night...";
			String name1 = "Reading a book at 6 o'clock...";
			fw.write(name1);
			fw.write(name);
			fw.flush();
		}
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
				

	}

}

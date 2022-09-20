package file;

import java.io.FileWriter;
import java.io.IOException;

public class E007_writer {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Himlay\\eclipse-workspace\\test.txt");
			String data = "file writing practicle....";
			fw.write(data);
			fw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}

package file;

import java.io.File;
import java.io.IOException;


public class E009_file {

	public static void main(String[] args) {
     File f = new File("C:\\Windows\\Help");
		 
	System.out.println(f.isFile());
		System.out.println(f.isDirectory());
//		f.mkdir();
//		
		if (f.exists())
		{
			System.out.println("file is available...");
			f.delete();
			System.out.println("file is deleted...");
		}
		else
		{
			System.out.println("no file is there...");
			try {
				f.createNewFile();
				System.out.println("file is created...");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	}

package servlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_validation {

	public static boolean passvalidation(String pass)
	{
		//String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\da-zA-Z]).{8,15}$";
				// in brackets means it's compulsory alphabet or number or digit.. 

         Pattern p = Pattern.compile(regex);
		
         Matcher m = p.matcher(pass);
         return m.matches();
	}
	
}

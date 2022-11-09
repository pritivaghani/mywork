package servlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_validation {

	public static boolean emailcheck(String email)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(email);
		return m.matches();
		
	}
	
	
}

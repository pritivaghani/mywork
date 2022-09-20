package assignment_2;

import java.util.Arrays;

public class A033_anagram_string {

	public static void main(String[] args) {
		String a= "WXYZ";
		String a2 = "YWZX WYZX YWXZ WXYZ YZWX WYXZ";
		
		char p[] = a.toCharArray();
		char p1[] = a2.toCharArray();
		
		
	Arrays.sort(p);
	Arrays.sort(p1);
	
	
	boolean result = Arrays.equals(p, p1);
	
	
	if (result == true)
	{
		System.out.println(" string is anagram");
	}
	else 
	{
		System.out.println("string is not anagram");
	}
	
	}

	
}

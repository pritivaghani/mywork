package homeworkternary;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
		String name = "pat";
		String name1 = "tap";
		
		char ch[] = name.toCharArray();
		char ch1[] = name1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		boolean result = Arrays.equals(ch, ch1);
		
		if(result == true)
		{
			System.out.println("string is anagram");
		}
		else
		{ 
			System.out.println("string isnot anagram");
		}
		
	}	
	}

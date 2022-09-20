package string;

import java.util.concurrent.ForkJoinPool;

public class String_method {

	public static void main(String[] args) {
		
		String name = " Java is a difficult subject to learn";
		
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(4));
		System.out.println(name.indexOf('i'));
		System.out.println(name.replace('i', 'g'));
		System.out.println(name.substring(5));
		System.out.println(name.substring(6, 25));
		System.out.println(name.trim());
		
	}
	
}

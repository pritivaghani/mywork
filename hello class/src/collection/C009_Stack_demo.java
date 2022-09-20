package collection;

import java.util.Stack;

public class C009_Stack_demo {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		s.push("vollyboll");
		s.push("cricket");
		s.push("hockey");
		s.push("bad-minton");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
	
		System.out.println("+++++++++++");
		
		for(String st : s)
		{
			System.out.println(st);
		}
		
		System.out.println("++++++++++++++++");
		
		System.out.println(s.peek());
		
		
		System.out.println("++++++++++++++++++++");
		
		for (String st : s)
		{
			System.out.println(st);
		}

	}

}

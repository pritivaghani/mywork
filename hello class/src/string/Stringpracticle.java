package string;

public class Stringpracticle {

	public static void main(String[] args) {
		
		String name = "Sun rises in east";
		
	char ch[] = name.toCharArray();
	for (int i = ch.length-1; i>=0; i--) {
		System.out.print(ch[i]+" ");
	}
	System.out.println(" ");
	
	System.out.println("*********");
	
	String ar[] = name.split(" ");
	for (int i = ar.length-1; i>=0; i--) {
		System.out.print(ar[i]+" ");
	}
	System.out.println(" ");
	
System.out.println("+++++++++++");
		
	for (int i = 0; i < ar.length; i++) {
		
		char c[] = ar[i].toCharArray();
		for (int j = c.length-1; j >=0; j--) {
			System.out.print(c[j]+" ");
		}
		
	}
	System.out.println(" ");
	System.out.println("+++++++++++");
	
	String temp = ar[0];
	ar[0] = ar[ar.length-1];
	ar[ar.length-1] = temp;
	
	for (int i = 0; i < ar.length; i++) {
		System.out.print(ar[i]+" ");
	}
	System.out.println(" ");
	
	}

}

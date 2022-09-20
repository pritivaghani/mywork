package string;

public class Swapping {

	public static void main(String[] args) {
		int p = 20;
		int j = 40;
		System.out.println("p: " +p);
		System.out.println("j: " +j);
		
//		int temp = p;
//		p = j;
//		j = temp;
		
		p = p*j;
		j = p/j;
		p = p/j;
		
		
		System.out.println("p: "+p);
		System.out.println("j: "+j);

	}

}

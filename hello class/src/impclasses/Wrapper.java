package impclasses;

public class Wrapper {

	public static void main(String[] args) {
	
		int a = 20;
		//boxing
		Integer i = new Integer(a);
		
		//auto boxing
		Integer i1 = a;
		
		Integer p = new Integer(90);
		//unboxing
		int j = p.intValue();
		
		//auto boxing
		int jp = p;
		
		System.out.println(jp);
		
		int k = 145643;
		
		Integer l = k;
		System.out.println(l);
		
		int n = l.toString().length();
		
		System.out.println(n);
	}

}

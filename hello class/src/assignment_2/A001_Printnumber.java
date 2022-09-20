package assignment_2;
 class Printnumber
 {
	public void printn(byte b)
	{
		System.out.println(b);
	}
	
	public void printn(int i)
	{
		System.out.println(i);
	}
	
	public void printn(short s)
{
		System.out.println(s);
		
}
	
	public void printn(float f)
	{
		System.out.println(f);
	}
	
	public void printn(double d)
	{
		System.out.println(d);
	}
	
	public void printn(char ch)
	{
		System.out.println(ch);
	}
	
	public void printn(String name)
	{
		System.out.println(name);
	}
 }
public class A001_Printnumber {

	public static void main(String[] args) {
		
		Printnumber p = new Printnumber();
		p.printn((byte) 45);
	    p.printn(267);
	    p.printn(23);
	    p.printn(234f);
	    p.printn(90.89);
	    p.printn('A');
	    p.printn("Priti");
	}

}

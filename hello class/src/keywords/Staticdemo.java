package keywords;

class Abc
{
	static int count;
	
	Abc()
	{
		count++;
		System.out.println(count);
	System.out.println("constuctor calling ....");
	
}


}
public class Staticdemo {

	public static void main(String[] args) {
		Abc a = new Abc();
        Abc a2 = new Abc(); 
        Abc a3 = new Abc();
        Abc a4 = new Abc();
	}

}

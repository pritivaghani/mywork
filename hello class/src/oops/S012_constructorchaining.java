package oops;

class D
{
	D()
	{
		
		System.out.println("calling D constructor....");	
	}
	D(int num)
	{
		this("priti");
		System.out.println(num);
	}
	D(String name)
	{
		this();
		System.out.println(name);
	}
}


class H extends D
{
	H()
	{
		super(10);
		System.out.println("calling H constuctor...");
	}
	H(String name)
	{
		this();
		System.out.println(name);
	}
	H(int a)
	{
		this("tops");
		System.out.println(a);
	}
}


class C extends H
{
	C()
	{
		
		super(20);
		System.out.println("Calling C constructor....");
	}
}


public class S012_constructorchaining {

	public static void main(String[] args) {
		 
		C c = new C();
		
	
	}

}

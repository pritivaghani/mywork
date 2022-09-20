package assignment_2;

abstract class Parent1
{
	public abstract void message();
}

class Priti  extends Parent1
{
	public void message()
	{
		System.out.println("This is a first subclass.");
	}
}

 class Priti2 extends Parent1
{

	@Override
	public void message() {
		System.out.println("This is a second subclass.");
	}
	
}
public class A008_abstract_parent {

	public static void main(String[] args) {
		
        Priti p = new Priti();
        p.message();
        
        Priti2 p2 = new Priti2();
        p2.message();
	}

}

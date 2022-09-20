package assignment_2;

class Parent
{
	public void display()
	{
		System.out.println("This is a parent class.");
	}
}

class Child
{
	Parent p2 = new Parent();
	public void towrite()
	{
		System.out.println("This is a child class.");
	}
}








public class A004_parent_child {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.display();
		
		Child c = new Child();
		c.towrite();
        c.p2.display();
	}

}

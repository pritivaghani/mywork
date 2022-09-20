package collection;


class Student 
{
	int age;
	String name;
	String sub;
	public Student(int age, String name, String sub)
	{
		this.age = age;
		this.name = name;
		this.sub = sub;
	}
	public void display()
	{
		System.out.println(age+" "+name+" "+sub);
	}

	@Override
	public String toString() {
		
		return "Student [age = "+ age +", name = "+ name+" ,sub = "+sub+"] "; 
	}
	
}

public class C010_Studentlist {

	public static void main(String[] args) {
	

	}

}

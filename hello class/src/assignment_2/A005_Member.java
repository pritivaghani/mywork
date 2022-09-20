package assignment_2;

 class Member
 {
	 int age = 40;
	 String name = "Tarun";
	 long phonenumber = 740533557;
	 int salary = 50000;
	 String address = "D-303, shantivan society, surat";
	 
	
	public void printsalary()
	{
		 System.out.println(salary);
	}
	
	public void display() {
		 System.out.println(name+" "+age+" "+phonenumber+" "+address+" "+salary);
	 }
 }

class Employee extends Member
{
	String specialization;
}

class Manager extends Member
{
	int department;
}


public class A005_Member {

	public static void main(String[] args) {
	
		Member m = new Member();
		m.printsalary();
		
		Employee e = new Employee();
		e.display();
		
		Manager a = new Manager();
		a.display();
	}

}

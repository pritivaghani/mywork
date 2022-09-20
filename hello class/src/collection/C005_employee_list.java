package collection;


class Employee    implements Comparable<Employee>
{
	String name;
	int age;
	String email;
	
	public Employee(String name, int age, String email) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		
	}
	public void getdata()
	{
		System.out.println(name+" "+age+" "+email);
	}
//	@Override
//	public int compareTo(Employee o) {
//		int age1 = o.age;
//		int age2 = this.age;
//		int i = 0;
//		
//		if(age1<age2)
//		{
//			i = 1;
//		}
//		else if (age1>age2)
//		{
//			i = -1;
//		}
//	else
//			{
//				i = 0;
//				
//			}
//		return i;
//	}
//	}
	@Override
	public int compareTo(Employee o) {
		
		int age = o.age;
		int age1 = this.age;
		int i = 0;
		
		if(age<age1)
		{
			i = 1;
		}
		else if(age>age1)
		{
			i = -1;
		}
		else
		{
			i = 0;
		}
		return i;
	}

public class C005_employee_list {

	public static void main(String[] args) {
		
	}

}
}


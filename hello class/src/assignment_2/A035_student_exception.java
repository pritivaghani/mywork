package assignment_2;

class AgeNotWithinRangeException extends RuntimeException
{
	
}

class NameNotValidException extends RuntimeException
{
	
}
class Student
{
	int rollno;
	String name;
	int age;
	String course;
	
	public Student(int rollno, String name, int age, String course)
	{
	    this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void getage()
	{
		if (age<15 && age>21)
		{
			throw new AgeNotWithinRangeException();
		}
		else
		{
			char ch[] = name.toCharArray();
			String special = "@#$%&*()'+,-./:;<=>?[]^_`{|}";
			for (int i = 0; i < ch.length; i++) 
			{
				if(Character.isDigit(ch[i]) || special.contains(Character.toString(ch[i])));
				{
					throw new NameNotValidException();
				}
			}
			System.out.println(rollno+" "+name+" "+age+" "+course);
		}
	}
}

public class A035_student_exception {

	public static void main(String[] args) {
		
		Student s = new Student(67, "priti$", 90, "java");
		s.getage();
		

	}

}

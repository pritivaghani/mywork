package assignment_2;

class Sunday
{
	int integer;
	char character;
	
	Sunday(int integer, char character)
	{
		this.integer = integer;
		this.character = character;
	}
	
	Sunday(char character, int integer)
	{
		this.character = character;
		this.integer = integer;
	}
	
	public void display()
	{
		System.out.println(integer+" "+character);
	}
	
	public void getdata()
	{
		System.out.println(character+" "+integer);
	}
}

public class A002_integer_character {

	public static void main(String[] args) {
	    
		Sunday s = new Sunday(900,'P');
		s.display();
		
		Sunday s2 = new Sunday('J',500);
		s2.getdata();
	}

}

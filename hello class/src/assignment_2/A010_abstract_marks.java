package assignment_2;

abstract class Marks
{
	int science;
	int maths;
	int computer;
	int english;
	int gujarati;
	
	public abstract void getpercentage(); 
}

class StudentA extends Marks
{
	
	
	StudentA(int english, int maths, int gujarati)
	{
		this.english = english;
		this.maths = maths;
		this.gujarati = gujarati;
	}
	 
		public void getpercentage()
		{
			int total = english+maths+gujarati;
			 double percentage = (total*100)/300;
			 System.out.println("Percentage of studentA: " +percentage);
		}
}

class StudentB extends Marks
{
	
	StudentB(int science, int maths,int computer, int english)
	{
		this.science = science;
		this.maths = maths;
		this.computer = computer;
		this.english = english;
		
	}
	
	public void getpercentage()
	{
		int total = science+maths+computer+english;
	     double percentage = (total*100)/400;
		System.out.println("Percentage of StudentB: " +percentage);
	}
}
public class A010_abstract_marks {

	public static void main(String[] args) {
		
    StudentA s = new StudentA(50,50,50);
    s.getpercentage();
    
    StudentB s2 = new StudentB(90,80,70,60);
    s2.getpercentage();
	}

}

package statements;

public class If_elseif_elseif {

	public static void main(String[] args) {
		int marks = 23;
		if (marks>=90)
		{
			System.out.println("grade A");
		}
		else if (marks<90 && marks>=70)
		{ 
			System.out.println("grade B");
		}
		else if (marks<70 && marks>=40)
		{
			System.out.println("grade c");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
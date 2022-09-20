package oops;
 
class Budget
{
	public void towrite()
	{
		System.out.println("Writing a book....");
	}
	public void arrayadd(int p[])
	{
		int sum = 0;
		for (int i = 0; i < p.length; i++) 
		{
		  sum = sum+p[i];
		}
		System.out.println(sum);
	}
}
public class S007sumarray {

	public static void main(String[] args) {
		
		Budget b = new Budget();
		b.towrite();
		
		int a[] = {10,10,10,10,10,10};
		b.arrayadd(a);
	}

}

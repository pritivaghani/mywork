package oops;

class Phone
{
	public void getdata()
	{
		System.out.println("getting data .....");
	}
	
	public void add(int a[])
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
	public int[] revArray (int a[])
			{
		     int c[] = new int[a.length];
		     int p = 0;
		     for (int i=a.length - 1;i>0;i--) 
		     {
			    c[p] = a[i];
			    p++;
			}
		     return c;
			}
}
public class S008reverse_array {

	public static void main(String[] args) {
	   Phone p = new Phone();
	   p.getdata();
	   
	   int d[] = {32,56,89,90,879,98};
	   p.add(d);
	   
	   int r[] = p.revArray(d);
	   for (int i = 0; i < r.length; i++) 
	   {
		System.out.println(r[i]);
	}

	}

}

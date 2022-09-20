package oops;

class Room
{
	public void arrayadd(int a[])
	{
		
		for (int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void array(int p[])
	{
		for (int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}
}
	public class S006Arrayadd {

	public static void main(String[] args) {
		
		Room r = new Room();
	     int j[] = {32,43,34,43,24};
	     r.arrayadd(j);
	     
	     
	     int k[] = {12,32,44,54,76,77,80};
	     r.array(k);
	}

}

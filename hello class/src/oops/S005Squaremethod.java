package oops;

class Multiplication
{
//	public void square(int j)
//	{
//		int square = j*j;
//		System.out.println(square);
//	}
    public int square(int p)
    {
    	int square = p*p;
    	return square;
    }
     
    public int add(int j, int p)
    {
    	int sum = j+p;
    	return sum;
    }
}
public class S005Squaremethod {

	public static void main(String[] args) {
		Multiplication mp = new Multiplication();
		mp.square(6);
		
		int r = mp.square(8);
		System.out.println(r);
		
		int k = mp.add(12, 32);
		System.out.println(k);
	}

}

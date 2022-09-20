package impractical;

public class Pattern6 {

	public static void main(String[] args) {
		  for(int i=1;i<=5;i++)
		  {
			for (int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=9;j>=(i*2)-1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		  }
	}

}

package impractical;

public class Spacepattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{

			for(int k=0;k<=4;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
		
          System.out.println();
		}
	}
}
package impractical;

public class Hollowpattern {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for (int k=4;k>=i;k--)
			{ 
				System.out.print(" ");
			}
			for (int j=1;j<=(i*2)-1;j++)
			{
				if (j>1 && j<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
				System.out.println();
			}
	for (int i=4;i>=1;i--)
	{
		for (int k=4;k>=i;k--)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=(i*2)-1;j++)
		{
			if (j>1 && j<(i*2)-1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
		}
	}



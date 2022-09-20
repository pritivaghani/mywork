package assignment;

public class A006numericpattern {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				sum = sum+1;
				System.out.print(sum+" ");
			}
			System.out.println();
		}

	}

}

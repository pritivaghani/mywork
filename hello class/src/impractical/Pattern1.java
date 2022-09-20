package impractical;

public class Pattern1 {

//	public static void main(String[] args) {
//	int lines = 5;
//	int starcount = lines;
//	for(int j=1;j<=lines;j++)
//	{
//		for(int i=5;i>=j;i--)
//		{			System.out.print("*");
//		}
//			System.out.println();
//     starcount--;
//     }
//
//	}
//
//}
//   
        public static void main(String[] args)    {
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
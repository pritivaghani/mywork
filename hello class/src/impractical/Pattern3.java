
package impractical;

public class Pattern3 {

//	public static void main(String[] args) {
//		int lines = 5;
//		int starcount = 5;
//		int spaceCount = 0;
//		for(int j=1;j<=lines;j++)
//		{
//			for(int k=5;k>=spaceCount;k--)
//			{
//				System.out.print(" ");
//			}
//		 for(int i=5;i>=starcount;i--)
//		 {
//			 System.out.print( "*");
//		 }
//        System.out.println();
//        starcount--;
//        spaceCount++;
//		}
//	}
//
//}
   public static void main(String[] args)  {
	   for(int i=1;i<=5;i++)
	   {
		   for(int k=4;k>=i;k--)
		   {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   }
   }
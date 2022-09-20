package impractical;

public class Pattern2 {

//	public static void main(String[] args) {
//		int lines = 5;
//	int starCount = lines;
//		for(int j=1;j<=lines;j++)
//		{
//	     for(int i=5;i>=starCount;i--)
//	     {
//	    	 System.out.print("*");
//	     }
//	System.out.println();
//	     starCount--;	     
//	}
//
//}
//}
	public static void main(String[] args)  {
		int lines = 5;
		int starCount = lines;
		for(int j=1;j<=lines;j++)
		{
		for(int i=1;i<=j;i++)
			{
			System.out.print("*");
		}
	System.out.println();
	starCount++
	
	;
		}
}

}
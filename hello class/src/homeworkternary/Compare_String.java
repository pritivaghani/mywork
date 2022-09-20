package homeworkternary;

public class Compare_String {

//	public static void main(String[] args) {
//	String  name = "keep";
//	String name1 = "peek";
//	
//	for (int i = 0; i < name.length(); i++) {
//		if (name.charAt(i)==name1.charAt(i))
//		{
//			System.out.println(true);
//		}
//		else
//		{
//			System.out.println(false);
//		}
//	}
//	}
//
//}

		public static void main(String[] args) {
			
			String name = "keep";
			String name1 = "peek";
			int flag =0;
			
			for (int i = 0; i < name.length(); i++) 
			{
				if (name.charAt(i)!=name1.charAt(i))
				{
					flag = 1;
					break;
				}
			}
				if (flag==0)
				{
					System.out.println("same");
				}
				else
				{
					System.out.println("not same");
				}
				}
				
			}
			
			
			
		
	
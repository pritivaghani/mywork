package assignment_2;

public class A029_compare_twostring {

	public static void main(String[] args) {
		
		String name = "topsint.com";
		String name1 = "Topsint.com";
		
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)==name1.charAt(i))
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
			
//			String a = "Topsint.com";
//			String b = "topsint.com";
//			
//			for (int j = 0; j < a.length(); j++) {
//				
//				if(a.charAt(i)==b.charAt(i))
//				{
//					System.out.println(true);
//				}
//				else
//				{
//					System.out.println(false);
//				}
//			}
		}
	}
	
}


package assignment_2;

public class A036_Try_catch {

	public static void main(String[] args) {
		try {
			int p[] = new int[5];
			p[5] = 50 / 0;
			
			try {
				int a = 10;
				int b = a / 0;

			} 
			catch (ArithmeticException e) 
			{
				e.printStackTrace();
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}
}

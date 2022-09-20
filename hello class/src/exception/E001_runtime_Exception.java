package exception;

public class E001_runtime_Exception {

	public static void main(String[] args) {
		
		System.out.println("programe started..");

       try {
//			int a = 10;
//			int b = a/0;
			
			int a[] = new int[5];
			a[8] = 40;
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Watching a movie...");
		}
		System.out.println("programe ended..");
		
	
		
		For f = new For();
		try {
			f.demo();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

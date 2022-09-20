package exception;

class For
{
	public void demo() throws ClassNotFoundException 
	{
		Class.forName("demo.java");
	}
}


public class E002_compiletime_exception {

	public static void main(String[] args) {
		
      try {
		
    	  Class.forName("demo.java");
		
      }  
    	  catch (Exception e)
      {
		e.printStackTrace();
	}
	}

}

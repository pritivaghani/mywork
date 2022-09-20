package exception;

public class E006_eexception_overriding {

	public void getmsg() throws Exception
	{
		
	}

}

class Power extends E006_eexception_overriding 
{
	public void getmsg()  throws ArithmeticException
	{
		
	}
}
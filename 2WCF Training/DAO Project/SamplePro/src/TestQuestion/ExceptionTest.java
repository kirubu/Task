package TestQuestion;

public class ExceptionTest 
{
	public static void main(String[] args) 
	{
		try
		{
			ExceptionTest excep = new ExceptionTest();
			excep.badMethod();	
			System.out.println("A");
		}
		catch (Exception e) 
		{
			System.out.println("B");
		}
		finally {
			String str = "Hot, Java";
			System.out.println("C "+str instanceof String);
		}
	}

	private void badMethod() 
	{	
		throw new Error();
	}
}

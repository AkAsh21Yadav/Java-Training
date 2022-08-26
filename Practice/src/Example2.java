/*
 * Exception Handling
 */
import java.io.IOException;

public class Example2 
{
	 void checkAge(int age) throws ArithmeticException,IOException
	{
		if (age > 18)
		{
			System.out.println("Can Vote");
		}
		else
		{
			throw new ArithmeticException();
		}
	}

	public static void main(String[] args) 
	{
		Example2 f = new Example2();
		
		try
		{
			f.checkAge(15);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Execution completed");
		}
	}
}

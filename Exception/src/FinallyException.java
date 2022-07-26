
public class FinallyException 
{
	public static void main(String[] args) 
	{
		int a = 100;
		int b = 0;
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("\nFinally Block");
		}
	}
}

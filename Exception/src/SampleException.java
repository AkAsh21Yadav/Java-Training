
public class SampleException 
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
			System.out.println("Exception : "+e);
			System.out.println("\nException message : "+e.getMessage());
			System.out.println("\nException details : ");
			e.printStackTrace();
		}
	}
}

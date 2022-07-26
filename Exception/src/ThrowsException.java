
public class ThrowsException 
{
  static void checkAge(int age) throws ArithmeticException
  {
    if (age > 18) 
    {
    	System.out.println("Access granted for voting");
    }
    else 
    {
    	throw new ArithmeticException("Access denied for voting");
    }
  }

  public static void main(String[] args) 
  {
	  try
	  	{
		  checkAge(15); 
	  	}
	  catch(ArithmeticException e)
	  	{
		  e.printStackTrace();	  
		}
  }
}

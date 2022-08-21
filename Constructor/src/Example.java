
public class Example 
{
	int a,b;
	private Example(int a,int b)
	{
		System.out.println("Addition = "+(a+b));
	}
	public static void main(String[] args) 
	{
		new Example(12,15);
	}
}

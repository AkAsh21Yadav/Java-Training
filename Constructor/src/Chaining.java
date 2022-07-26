
public class Chaining 
{
	int a,b,c;
	
	public Chaining(int a)
	{
		this(11,11,11);
		System.out.println(a);
	}
	
	public Chaining(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public Chaining(int a,int b,int c)
	{
		this(11,11);
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args)
	{
		new Chaining(10);
	}
}

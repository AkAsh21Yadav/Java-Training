class Chain
{
	int a,b,c;
	
	public Chain(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
}

public class ChainingOutside extends Chain 
{
	int a,b,c;
	
	public ChainingOutside(int a) 
	{
		this(25,25);
		System.out.println(a);
	}
	
	public ChainingOutside(int a,int b)
	{
		super(11,11,11);
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		new ChainingOutside(15);
	}
}



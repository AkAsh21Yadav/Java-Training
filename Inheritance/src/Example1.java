
class Example
{
	public Example() 
	{
		this(100,200);
		System.out.println("AkAsh");
	}
	
	public Example(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	void display()
	{
		System.out.println("Java");
	}
}

public class Example1 extends Example
{

	public Example1() 
	{
		super();
		System.out.println("Tom");
	}

	public Example1(int a) 
	{
		this();
		System.out.println(a);
	}
	
	void display()
	{
		
		
		System.out.println("Selenium");
		super.display();
	}
	
	public static void main(String[] args) 
	{
		Example1 e = new Example1(21);
		e.display();
	}
	
}

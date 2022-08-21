
public class ConstructorOverloading 
{
	int a,b,c;
	
	public ConstructorOverloading(int a) 
	{
		System.out.println(a);	
	}
	public ConstructorOverloading(int a,int b)
	{
		System.out.println(a+b);
	}
	public ConstructorOverloading(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		new ConstructorOverloading(5);
		new ConstructorOverloading(12,14);
		new ConstructorOverloading(11,11,11);
	}
}

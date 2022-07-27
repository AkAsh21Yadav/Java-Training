
public class Example1 
{
	void addition(int a,int b)
	{
		System.out.println("Addition of 2 Numbers : "+(a+b));
	}
	
	void addition(int a,int b,int c)
	{
		System.out.println("Addition of 3 Numbers : "+(a+b+c));
	}
	
	void addition(int a,int b,int c,int d)
	{
		System.out.println("Addition of 4 Numbers : "+(a+b+c+d));
	}
	
	public static void main(String[] args) 
	{
		Example1 e = new Example1();
		e.addition(11,11);
		e.addition(11,11,11);
		e.addition(11,11,11,11);
	}
}

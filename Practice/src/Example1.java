/*
 * Constructor , Constructor Overloading , Constructor Chaining
 * Method Overloading
 * Static Method Overloading
 */

public class Example1 
{
	Example1(int a)
	{
		System.out.println("Number : "+a);
	}
	
	Example1(int a,int b)
	{
		this(21);
		System.out.println("Addition : "+(a+b));
	}
	
	void show(String name)
	{
		System.out.println("Name : "+name);
	}
	
	void show(int id)
	{
		System.out.println("ID : "+id);
	}
	
	static void pass(float fees)
	{
		System.out.println("Fees : "+fees);
	}
	
	static void pass(int seat )
	{
		System.out.println("Seat : "+seat);
	}
	
	public static void main(String[] args) 
	{
		Example1 e = new Example1(25,25);
		e.show(1);
		e.show("AkAsh");
		pass(3);
		Example1.pass(5214.231f);
	}
}

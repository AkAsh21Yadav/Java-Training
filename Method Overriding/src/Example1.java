
class Fruit
{
	Fruit()
	{
		System.out.println("This is Fruit's default constructor");
	}
	
	Fruit(int price)	//constructor overloading
	{
		this();	//Constructor chaining within same class
		System.out.println("Price : "+price);
	}
	
	static void cut()
	{
		System.out.println("Cut carefully");
	}
	void wash()
	{
		System.out.println("Wash carefully");
	}
}

public class Example1 extends Fruit
{	
	Example1()
	{
		super(2100);	//Constructor chaining outside class
		System.out.println("This is default constructor of Example1");
	}
	
	static void cut()	//static method overriding
	{
		System.out.println("Cutting fruits example");
	}
	
	@Override
	void wash()	//non-static method overriding
	{
		super.wash();	//calling parent class method
		System.out.println("Washing fruits example");
	}
	
	public static void main(String[] args) 
	{
		Example1 e = new Example1();
		e.wash();
		//Example1.cut();	//calling static method
		cut();	//calling static method
	}
}

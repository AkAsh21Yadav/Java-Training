
class Example
{
	static void eat()
	{
		System.out.println("Hello");
	}
}

public class StaticExample extends Example
{
	static void eat() //We cannot override the static method by instance method
	{
		System.out.println("Break");
	}
	
	public static void main(String[] args) 
	{
		StaticExample.eat();
	}
}

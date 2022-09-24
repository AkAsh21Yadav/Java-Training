
class Dog
{
	public Dog() 
	{
		System.out.println("Parent class constructor");
	}
}


public class Inheritance extends Dog
{
	public Inheritance() 
	{
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) 
	{
		new Inheritance();
	}
}


class Example
{
	public Example(float x) 
	{
		this(21.28f,34.32f);
		System.out.println("Float : "+x);
	}
	
	public Example(float x,float y) 
	{
		System.out.println("Float addition : "+(x+y));
	}
	
	void multiplication(int a,int b)
	{
		System.out.println("Division : "+(a/b));
	}
}	

public class ConstructorExample extends Example	//Inheritance
{
	public ConstructorExample(int a) 
	{
		this(21,12);
		System.out.println("A : "+a);
	}
	
	public ConstructorExample(int a,int b) //Constructor overloading
	{
		this(11,34,67);	  //Constructor Chaining Within same class
		System.out.println("Addition of 2 numbers : "+(a+b));
	}
	
	public ConstructorExample(int a,int b,int c) 
	{
		super(11.11f);	//Constructor Chaining Within same class
		System.out.println("Addition of 3 numbers : "+(a+b+c));
	}
	
	void multiplication(int a,int b)  //Method Overriding
	{
		super.multiplication(22,2);	 //Calling Parent class method from child class
		System.out.println("Multiplication : "+(a*b));
	}
	
	void multiplication(int a,int b,int c)	//Method Overloading
	{
		System.out.println("Subtraction : "+(a-b-c));
	}
	
	public static void main(String[] args) 
	{
		ConstructorExample c1 = new ConstructorExample(21);
		
		c1.multiplication(21,11);
		c1.multiplication(32,11,7);
	}
}

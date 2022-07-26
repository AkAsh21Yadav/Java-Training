class Calculator
{
	int a,b,c;
	String s1,s2;
		
	Calculator(int a, int b, int c) 
	{
		this.a = a;
		this.b = b; 
		this.c = c;
	}	
	Calculator(int a, int b) 
	{
		this.a = a;
		this.b = b;
	}	
	void getArea()
	{
		int d = a+b+c;
		System.out.println("Addition : "+d);
	}	
	void getName(String s1)
	{
		this.s1 = s1;
		System.out.println("Name : "+s1);
	}	
	void getName(String s1,String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		System.out.println("State : "+s1+"\nCity : " +s2);
	}	
	void getMulti()
	{
		int e = a*b;
		System.out.println("Multiplication : "+e);
	}			
}
public class Main1 
{
	public static void main(String[] args) 
	{		
		Calculator c1 = new Calculator(12,12,12);
		Calculator c2 = new Calculator(13,13);
		c1.getName("AkAsh");
		c1.getName("Maharashtra","Pune");
		c1.getArea();
		c2.getMulti();
	}
}
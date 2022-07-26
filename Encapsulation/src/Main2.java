class Animal
{
	int a,b,c,d;
	String s1,s2;
	
	public Animal(int a, int b, int c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;	
	}

	public Animal(String s1, String s2) 
	{ 
		this.s1 = s1;
		this.s2 = s2;
	}
	
	void getSub()
	{
		d = a - b - c;
		System.out.println("Subtraction : "+d);
	}
	
	void getName()
	{
		System.out.println("Country : "+s1+"\nState : "+s2);
	}
}
public class Main2 
{
	public static void main(String[] args) 
	{
		Animal a1 = new Animal(35,12,9);
		Animal a2 = new Animal("India","Telangana");
		a1.getSub();
		a2.getName();
	}
}

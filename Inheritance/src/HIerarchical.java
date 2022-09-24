
class A
{
	void display()
	{
		System.out.println("Information");
	}
}

class B extends A
{
	void display()
	{
		System.out.println("Correct");
	}
}

public class HIerarchical extends A
{
	void display()
	{
		super.display();
		System.out.println("Wrong");
	}
	
	public static void main(String[] args) 
	{
		HIerarchical h = new HIerarchical();
		h.display();
		A a = new B();
		a.display();
	}
}

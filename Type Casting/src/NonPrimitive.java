
class Non
{
	void info()
	{
		System.out.println("This is Information");
	}
}
public class NonPrimitive extends Non
{
	void display()
	{
		System.out.println("This is display");
	}
	
	public static void main(String[] args) 
	{
		Non n = new NonPrimitive();	//UPCASTING
		n.info();
		
		NonPrimitive n1 = (NonPrimitive) n;	//DOWNCASTING
		n1.display();
	}
}

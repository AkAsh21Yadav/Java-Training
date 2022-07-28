class Gadget
{
	void switchOn()
	{
		System.out.println("This is Gadget");
	}
}
class Phone extends Gadget
{
	@Override
	void switchOn()
	{
		System.out.println("This is Phone");
	}
}
class SmartPhone extends Phone
{
	@Override
	void switchOn()
	{
		System.out.println("This is SmarrtPhone");
	}
}
public class Upcasting 
{
	public static void main(String[] args) 
	{
		SmartPhone s = new SmartPhone();
		Phone p = s;
		Gadget g = p;
		Object o = g;
		
		System.out.println("Upcasting : "+o);
	}
}

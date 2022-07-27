class Vegetable
{
	void clean()
	{
		System.out.println("Clean");
	}
}

class Palak extends Vegetable
{
	void clean()
	{
		System.out.println("cleaning");
	}
}

public class MultilevelIneritance extends Palak 
{
	void clean()
	{
		System.out.println("Cleaning peacefully");
	}
	
	public static void main(String[] args) 
	{
		MultilevelIneritance m = new MultilevelIneritance();
		m.clean();
		
		Palak p = new Palak();
		p.clean();
	}
}

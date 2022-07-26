
abstract class Garage
{
	abstract void oiling();
	abstract void coloring();
	abstract void servicing();
}

class Bike extends Garage
{
	@Override
	void oiling() 
	{
		System.out.println("Oiling is done");
	}

	@Override
	void coloring() 
	{
		System.out.println("Coloring is done");
	}

	@Override
	void servicing() 
	{
		System.out.println("Servicing is done");		
	}
}

public class RunnerGarage 
{
	static 
	{
		System.out.println("This is Static Block\n");
	}
	public static void main(String[] args) 
	{
		Bike b = new Bike();
		b.coloring();
		b.oiling();
		b.servicing();
	}
}

class Jewel
{	
}
class Ring extends Jewel
{	
}
class Chain extends Jewel
{	
}
class Bracelet extends Jewel
{	
}
public class RunnerUpcasting 
{
	Jewel sell(String name)
	{
		if(name.equals("ring"))
		{
			System.out.println("This is Ring object\n");
			return new Ring();
		}
		else if(name.equals("chain"))
		{
			System.out.println("This is Chain object\n");
			return new Chain();
		}
		else if(name.equals("bracelet"))
		{
			System.out.println("This is Bracelet object\n");
			return new Bracelet();
		}
		else
		{
			System.out.println("This is FALSE");
			return null;
		}
	}	
	public static void main(String[] args) 
	{
		RunnerUpcasting r = new RunnerUpcasting();
		Jewel j = r.sell("ring");
		System.out.println(j);
	}
}

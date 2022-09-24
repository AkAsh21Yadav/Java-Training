class Jewel
{
	final int VALUE;
	
	public Jewel() 
	{
		VALUE = 2121;
	}
	
	final void price()
	{
		System.out.println("Price : High");
	}
}

final class Ring extends Jewel
{
	void type()
	{
		System.out.println("Type : Diamond");
	}
}

public class FinalKeywordExample 
{
	public static void main(String[] args) 
	{	
		Ring r = new Ring();
		r.type();
		r.price();
		System.out.println("Value : "+r.VALUE);			
	}
}

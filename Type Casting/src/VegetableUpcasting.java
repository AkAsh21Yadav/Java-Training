class Vegetable
{
	
}
class Tomato extends Vegetable
{
	
}
class Potato extends Vegetable
{
	
}
class Flower extends Vegetable
{
	
}
public class VegetableUpcasting 
{
	Vegetable shop(int a)
	{
		if(a==1)
		{	return new Tomato();	}
		else if(a==2)
		{	return new Potato();	}
		else if (a==3)
		{	return new Flower();	}
		else
		{	return null;	}
	}
	
	public static void main(String[] args) 
	{
		VegetableUpcasting vc = new VegetableUpcasting();
		Vegetable v = vc.shop(3);
		System.out.println(v);
	}
}

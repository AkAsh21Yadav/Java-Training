package com.ak.downcastingexample;

class Fruit
{
	void clean()
	{
		System.out.println("Clean the fruits.");
	}
}
class Apple extends Fruit
{
	void prepareMilkshake()
	{
		System.out.println("Prepare apple milkshake.");
	}
}
class Orange extends Fruit
{
	void prepareJuice() 
	{
		System.out.println("Prepare orange juice.");
	}
}
public class FruitMarket 
{
	Fruit sellFruit(String fruitName)
	{
		if(fruitName != null)
		{
			if(fruitName.equalsIgnoreCase("Apple"))
			{
				return new Apple();
			}
			else if(fruitName.equalsIgnoreCase("Orange"))
			{
				return new Orange();
			}
		}
		return null;
	}
	
	public static void main(String[] args) 
	{
		FruitMarket fm = new FruitMarket();
		Fruit f = fm.sellFruit("Pineapple");
			
		if(f != null)
		{
			f.clean();
			if(f instanceof Apple)
			{
				Apple a = (Apple) f;
				a.prepareMilkshake();
			}
			else if(f instanceof Orange)
			{
				Orange o = (Orange) f;
				o.prepareJuice();
			}
		}
		else
		{
			System.out.println("No such fruit is available");
		}
	}
}



















package com.ak.downcasting;

class Animal
{
	String color, type;
	void eat()
	{
		System.out.println("Animal Eats");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("");
	}
}
class Cat extends Animal
{
	boolean hasClaws;
	void meow()
	{
		System.out.println("Cat meow's");
	}
}
public class Zoo 
{
	Animal openGate(String animalName)
	{
		if(animalName.equalsIgnoreCase("dog"))
		{
			Dog d = new Dog();
			d.color = "Black";
			d.type = "Domestic";
			return d;
		}
		else if(animalName.equalsIgnoreCase("cat"))
		{
			Cat c  = new Cat();
			c.color = "White";
			c.type = "Wild";
			c.hasClaws = true;
			return c;
		}	
		else
		{
			return null;
		}
	}	

	public static void main(String[] args) 
	{
		Zoo z = new Zoo();
		Animal a = z.openGate("cat");
		
		if(a != null)
		{
			System.out.println(a.color);
			System.out.println(a.type);
			a.eat();
			
			if (a instanceof Dog)
				{
					Dog d = (Dog) a;
					d.bark();
				}
			else if (a instanceof Cat) 
				{
					Cat c = (Cat) a;
					System.out.println(c.hasClaws);
					c.meow();
				}
		}
		System.out.println("Completed Program");
	}	
}

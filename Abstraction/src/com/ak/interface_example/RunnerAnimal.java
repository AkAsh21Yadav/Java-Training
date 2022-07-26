package com.ak.interface_example;

interface Animal
{
	 void eat();
	default void type()
	{
		System.out.println("Domestic");
	}
}

interface Dog extends Animal
{
	 void sleep();
}

class Cat implements Dog
{
	public void eat()
	{
		System.out.println("Cat Eats");
	}
	public void sleep()
	{
		System.out.println(("Cat sleeps"));
	}
}

public class RunnerAnimal 
{
	public static void main(String[] args) 
	{
		Cat c  = new Cat();
		c.eat();
		c.sleep();
		c.type();
	}
}

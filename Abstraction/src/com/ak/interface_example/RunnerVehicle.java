package com.ak.interface_example;

interface Vehicle
{
	abstract void color();
	abstract void price();
	public default void brand()
	{
		System.out.println("Brand : Mercedes");
	}
}
class Car implements Vehicle
{
	@Override
	public void color() 
	{
		System.out.println("Color : Black");
	}

	@Override
	public void price() 
	{
		System.out.println("Price : 5214251");
	}
}
class BMW extends Car
{
	@Override
	public void color()
	{
		System.out.println("Color : White");
	}
}
public interface RunnerVehicle 
{
	public static void main(String[] args) 
	{
		Vehicle v = new BMW();
		v.brand();
		v.color();
		v.price();
	}
}

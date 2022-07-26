package com.ak.interface_example;

interface Garage
{
	void servicing();
}
interface Bike
{
	void start();
}
public class MultipleInheritance implements Garage,Bike
{
	@Override
	public void servicing() 
	{
		System.out.println("Bike servicing done...");
	}
	
	@Override
	public void start() 
	{
		System.out.println("Bike starts...");
	}

	public static void main(String[] args) 
	{
		MultipleInheritance m = new MultipleInheritance();
		m.servicing();
		m.start();
	}
}

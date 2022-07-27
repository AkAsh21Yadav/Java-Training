/*
 * Only static method will override another static method
 * Only Instance method will override another Instance method
 */

class Vehicle
{
	 static void servicing()
	{
		System.out.println("Servicing");
	}
}

class Bike extends Vehicle
{
	static void servicing()
	{
		System.out.println("Servicing best");
	}
}

public class HierarchicalInheritance extends Vehicle
{
	static void servicing()
	{
		System.out.println("Servicing better");
	}
	
	public static void main(String[] args) 
	{
		HierarchicalInheritance.servicing(); 
	}
}


class Vehicle
{
	protected double price;
	protected String color,brand;
	
	void start()
	{
		System.out.println("\nTurn the key to start the car...");
	}
}

class Suv extends Vehicle
{
	Suv(String brand,String color,double price)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	@Override
	void start()
	{
		System.out.println("\nBrand : "+brand+"\nColor : "+color+"\nPrice : "+price);
	}
}

public class InheritanceinEncapsulation 
{
	public static void main(String[] args) 
	{
		Suv s1 = new Suv("BMW","Silver",4125362.21);
		Suv s2 = new Suv("Mercedes","Black",6523142.25);
		s1.start();
		s2.start();
		Vehicle v = new Vehicle();
		v.start();
	}
}

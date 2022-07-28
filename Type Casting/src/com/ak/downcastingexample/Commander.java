package com.ak.downcastingexample;

class Weapon
{

}
class Bomb extends Weapon
{
	void throwBomb()
	{
		System.out.println("Throw the bomb.");
	}
}
class Gun extends Weapon
{
	void shoot()
	{
		System.out.println("Shoot with gun.");
	}
}
public class Commander 
{
	Weapon giveWeapon(int option)
	{
		if(option == 1)
		{
			return new Bomb();
		}
		else if (option == 2)
		{
			return new Gun();
		}
		else
		{
			return null;
		}
	}
	public static void main(String[] args) 
	{
		Commander c = new Commander();
		Weapon w = c.giveWeapon(1);		// Upcasting
		
		if(w != null)					// To avoid NullPointerException
		{
			if (w instanceof Bomb) 		// To avoid ClasCastException
			{
				Bomb b = (Bomb) w;		//Downcasting
				b.throwBomb();
				System.out.println(b);
			}
			else if (w instanceof Gun)	// To avoid ClassCastException
			{
				Gun g = (Gun) w;		//Downcasting
				g.shoot();
				System.out.println(g);
			}
		}
		else
		{
			System.out.println("This option is not available.");
		}
	}		
}

package com.akash.datahiding;

class Dog
{
	private int price;
	private String color,name;
	
	int getprice()
	{	
		return price;	
	}
	void setPrice(int price)
	{	
		this.price = price;	
	}
	String getColor()
	{	
		return color;
	}
	void setColor(String color)
	{	
		this.color = color;	
	}
	String getName()
	{
		return name;	
	}
	void setName(String name)
	{	
		this.name = name;
	}
}

public class Aniaml 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.setName("Alpha");
		d.setColor("Black");
		d.setPrice(21345);
		
		System.out.println("Name : "+d.getName()+"\nColor : "+d.getColor()+"\nPrice : "+d.getprice());		
	}
}

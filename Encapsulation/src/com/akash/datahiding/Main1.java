package com.akash.datahiding;

class Calculator
{
	private int a,b;
	private String s1,s2;

	public int getAdd()
	{
		return a+b;
	}

	public void setAdd(int a,int b) 
	{
		this.a = a;
		this.b = b;
	}

	public String getConcat() 
	{
		return  s1 + s2;
	}

	public void setConcat(String s1,String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
}
public class Main1 
{
	public static void main(String[] args) 
	{
		Calculator c =  new Calculator();
		c.setAdd(12,13);
		c.setConcat("AkAsh"," Yadav");
		c.setAdd(45,50); //Overrides the earlier values.

		System.out.println("Addition : "+c.getAdd()+"\nName : "+c.getConcat());
	}
}
package com.ak.interface_example;

interface Exam
{
	void location();
	void eng();
}

interface Center
{
	void location();
	void name();
}

public class Example1 implements Exam,Center
{
	@Override
	public void eng() 
	{
		System.out.println("English");
	}

	public static void main(String[] args) 
	{
		Example1 e = new Example1();
		e.eng();
		e.name();e.location();
	}

	@Override
	public void location() 
	{
		System.out.println("Location");
	}

	@Override
	public void name() 
	{
		System.out.println("Name");
	}
}

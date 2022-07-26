package com.ak.interface_example;

interface WebDriver
{
	abstract void get(String url);
	abstract void getTitle();
	abstract void close();
}

class ChromeDriver implements WebDriver
{

	@Override
	public void get(String url) 
	{
		System.out.println("Open the url : " +url);
	}

	@Override
	public void getTitle() 
	{
		System.out.println("Title through Chrome");	
	}

	@Override
	public void close() 
	{
		System.out.println("Close Chrome");
	}
}

class FirefoxDriver implements WebDriver
{
	@Override
	public void get(String url) 
	{
		System.out.println("\nOpen the url : "+url);
	}

	@Override
	public void getTitle() 
	{
		System.out.println("Title through Firefox");
	}

	@Override
	public void close() 
	{
		System.out.println("Close Firefox");	
	}
}

public class RunnerDriver
{
	public static void main(String[] args) 
	{
		WebDriver w1 = new ChromeDriver();
		w1.get("https://www.google.com/");
		w1.getTitle();
		w1.close();
		
		WebDriver w2 = new FirefoxDriver();
		w2.get("https://www.firefox.com/");
		w2.getTitle();
		w2.close();
	}
}

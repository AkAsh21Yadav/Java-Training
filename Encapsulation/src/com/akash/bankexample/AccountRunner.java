package com.akash.bankexample;

class Account{
	private long no;
	private double balance;
	private String name,type;
	private boolean isInactive;

	public void setNo(long no) 
	{
		this.no = no;
	}
	public long getNo() 
	{
		return no;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public String getType() 
	{
		return type;
	}
	public void setIsInactive(boolean isInactive) 
	{
		this.isInactive = isInactive;
	}
	public boolean getIsInactive() 
	{
		return isInactive;
	}
	
	@Override
	public String toString() 
	{
		return "\nAccount [no="+ no + ", balance=" + balance + ", name=" + name + ","
				+ " type=" + type + ", isInactive=" + isInactive + "]";
	}
}

public class AccountRunner 
{
	public static void main(String[] args) 
	{
		Account a = new Account();
		
		a.setNo(23514251247L);
		a.setName("AkAsh");
		a.setType("Saving");
		a.setBalance(42514.35);
		a.setIsInactive(false);
		
		System.out.println("Account No. : "+a.getNo()+"\nAccount Name : "+a.getName()+
				"\nAccount Type : "+a.getType()+"\nAccount Balance : "+a.getBalance()+
				"\nAccount isInactive : "+a.getIsInactive());
		
		System.out.println(a);
	}
}

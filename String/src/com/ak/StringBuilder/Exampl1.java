package com.ak.StringBuilder;

public class Exampl1 
{
	public static void main(String[] args) 
	{
		StringBuilder s = new StringBuilder();
		s.append("ABC ");
		s.append("XYZ ");
		s.append("PQR");
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(s.charAt(1));
		System.out.println(s.isEmpty());
		System.out.println(s.reverse());
		s.setCharAt(3,'G');
		s.deleteCharAt(7);
		System.out.println(s);
	}
}
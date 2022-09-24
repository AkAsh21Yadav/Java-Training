package com.ak.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(11,12,13,14));
		System.out.println("Elements : "+a);
		System.out.println("Is Empty : "+a.isEmpty());
		System.out.println("Size : "+a.size());
		a.add(2,21);
		System.out.println("Replace : "+a.set(1,222));
		System.out.println("Remove : "+a.remove(3));
		System.out.println("Retrieve : "+a.get(2));
		System.out.println(a);
		a.clear();
		System.out.println("Size after clear : "+a.size());
		
		System.out.println("\n\n");
		ArrayList b = new ArrayList(Arrays.asList(21,12.2112,null,null,true,"AkAsh",true,"AkAsh"));
		System.out.println(b);
		System.out.println(b.isEmpty());
		System.out.println(b.get(5));
		System.out.println(b.remove(3));
		System.out.println(b);
		System.out.println(b.size());
		b.clear();
		System.out.println(b);
		
	}
}

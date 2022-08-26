package com.ak.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 
{
	public static void main(String[] args) 
	{
		System.out.println("Homogenous ArrayList : ");
		ArrayList<Integer> id = new ArrayList<>(Arrays.asList(21,22,33,45,65,43,21,22));
		System.out.println("Elements : "+id);
		System.out.println("Size : "+id.size());
		System.out.println("Contains : "+id.contains(22));
		System.out.println("Is Empty : "+id.isEmpty());
		System.out.println("Index of : "+id.indexOf(45));
		System.out.println("remove : "+id.remove(3));
		System.out.println("Insert : "+id.set(2,11));
		System.out.println("Size before clear : "+id.size());
		id.clear();
		id.add(101);	id.add(202);
		System.out.println("Size after clear : "+id.size());
		System.out.println("Elements of list : "+id);
		
		System.out.println("\n\nHeterogenous ArrayList : ");
		ArrayList a = new ArrayList(Arrays.asList("Akash",true,null,null,null,true,21,11.11));
		System.out.println("Elements : "+a);
		System.out.println("Size : "+a.size());
		System.out.println("is Empty : "+a.isEmpty());
		System.out.println("Index : "+a.indexOf(null));
		System.out.println("Get element : "+a.get(0));
		System.out.println("Remove : "+a.remove(4));
		System.out.println("Insert : "+a.set(4,"Yadav"));
		System.out.println("Elements : "+a);
		a.clear();
		System.out.println("Size after clear : "+a.size());
	}
}

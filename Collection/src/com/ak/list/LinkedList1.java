package com.ak.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 
{
	public static void main(String[] args) 
	{
		LinkedList<Character> blocks = new LinkedList<>(Arrays.asList('A','B','C','X','Y','Z'));
		System.out.println("Elements : "+blocks);
		System.out.println("Size : "+blocks.size());
		System.out.println("Index : "+blocks.indexOf('C'));
		System.out.println("Element : "+blocks.get(4));
		System.out.println("First element : "+blocks.getFirst());
		System.out.println("Last element : "+blocks.getLast());
		System.out.println("Remove : "+blocks.remove(2));
		System.out.println("Remove last : "+blocks.removeLast());
		System.out.println("Elemets : "+blocks);
		blocks.clear();
		System.out.println("Size after clear : "+blocks.size());
	
	}
}

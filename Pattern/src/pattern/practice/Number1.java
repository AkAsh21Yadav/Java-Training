package pattern.practice;

import java.util.Scanner;

public class Number1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = s.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for (int i = 0; i < num; i++) 
		{int k = 1;
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for (int i = 0; i < num; i++) 
		{int k = 0;
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for (int i = 0; i < num; i++) 
		{int k = 1;
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("\n");
		int k = 1;
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
package pattern.practice;

import java.util.Scanner;

public class Number2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = s.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			for (int j = num-i; j > 1; j--) 
			{
				System.out.print(" ");
			}
		
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();	
		}
		
		System.out.println("\n");
		for (int i = 0; i < num; i++) 
		{int k = 0;
			for (int j = num-i; j > 1; j--) 
			{
				System.out.print(" ");
			}
		
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(k+" ");
			}
			
			System.out.println();	
		}
		
		System.out.println("\n");
		for (int i = 0; i < num; i++) 
		{int k = 0;
			for (int j = num-i; j > 1; j--) 
			{
				System.out.print(" ");
			}
		
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(k+" ");
				k++;
			}
			
			System.out.println();	
		}
		
		System.out.println("\n");
		int k = 0;
		for (int i = 0; i < num; i++) 
		{
			for (int j = num-i; j > 1; j--) 
			{
				System.out.print(" ");
			}
		
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(k+" ");
				k++;
			}
			
			System.out.println();	
		}
		
		System.out.println("\n");
		int a = 1;
		for (int i = 0; i < num; i++) 
		{
			for (int j = num-i; j > 1; j--) 
			{
				System.out.print(" ");
			}
		
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(a);
				a++;
			}
			
			System.out.println();	
		}
		
	}
}

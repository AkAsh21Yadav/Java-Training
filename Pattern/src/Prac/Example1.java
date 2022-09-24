package Prac;

import java.util.Scanner;

public class Example1 
{
	public static void main(String[] args) 
	{
		Scanner number = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int count = number.nextInt();
		
		int k = 1;
		for(int i=0;i<count;i++)
		{
			for(int j=count-i;j>1;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}

package pattern.practice;

import java.util.Scanner;

public class Star1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = s.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j <= i ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
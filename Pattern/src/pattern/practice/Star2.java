package pattern.practice;

import java.util.Scanner;

public class Star2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = s.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			for (int j = num; j > i; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
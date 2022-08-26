import java.util.Scanner;

/*
  			1
			1 2
Pattern  = 	1 2 3
			1 2 3 4
			1 2 3 4 5
 */

public class Number1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int row = s.nextInt();
		
		int i,j;
		
		for(i=0;i<row;i++)
		{
			int k = 1;
			for(j=0;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}

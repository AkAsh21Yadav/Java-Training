import java.util.Scanner;
/*
			1
			11
Pattern = 	111
			1111
			11111
 * 
 * 
 * 
 */
public class Number2 
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
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

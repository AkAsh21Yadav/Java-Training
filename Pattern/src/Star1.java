import java.util.Scanner;
/*
 			***
 pattern =	**
 			* 
 */

public class Star1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int row = s.nextInt();
		
		for(int i=row;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

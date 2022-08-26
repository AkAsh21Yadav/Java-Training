import java.util.Scanner;
/*
 *  0 
	0 1 
	0 1 2 
	0 1 2 3 
	0 1 2 3 4 
 */
public class Number 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int row = s.nextInt();
		
	
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

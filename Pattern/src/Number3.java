import java.util.Scanner;
/*
			1 
			2 3 
Pattern = 	4 5 6 
			7 8 9 10 
			11 12 13 14 15  
 */
public class Number3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int row = s.nextInt();
		
		int i,j,k=1;
		for(i=0;i<row;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
}

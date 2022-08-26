import java.util.Scanner;
/*			
  			*
 Pattern = 	**
 			***

 */
public class Star 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int row =	s.nextInt();
		
		int i,j;
		
		for(i=0;i<row;i++)
		{		
		  for(j=0;j<=i;j++)
			{
			  System.out.print("*");
			}
		  System.out.println();
		}
	}
}

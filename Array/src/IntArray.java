import java.util.Scanner;

public class IntArray 
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		System.out.println("Enter elements of First Array : ");
		for (i = 0; i < n; i++) 
		{	
			num[i] = sc.nextInt();
		}
		
		for (i = 0; i < n; i++) 
		{	
			System.out.println("Element : "+num[i]);
		}
		
		int[] num1 = new int[n];
		System.out.println("\nEnter elements of Second Array : ");
		for (j = 0; j < n; j++) 
		{	
			num1[j] = sc.nextInt();
		}
		
		for (j = 0; j < n; j++) 
		{	
			System.out.println("Element : "+num1[j]);
		}
	
	}
}

import java.util.Scanner;

public class Palin 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = s.nextInt();
		int sum = 0;
		int remainder;
		int temp = number;
		
		while(number!=0)
		{
			remainder = number % 10;
			sum = sum * 10 + remainder;
			number = number / 10;
		}
		
		if(temp == sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
		
		
		
		
		
		
	}
}

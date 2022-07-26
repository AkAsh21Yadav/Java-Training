import java.util.Scanner;

public class PalindromeEx 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = s.nextInt();
		int temp = number;
		int remainder;
		int sum = 0;
		
		while(number!=0)
		{
			remainder = number % 10;
			sum = sum * 10 + remainder;
			number = number / 10;
		}
		
		if(temp == sum)
			System.out.println("PALINDROME");
		else
			System.out.println("SORRY");
		
		System.out.print("Enter the value of a : ");
		int a = s.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = s.nextInt();
		
		System.out.println("Greater Number : "+(a > b ? a : b));
	}
}

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		int number = sc.nextInt();
		int sum = 0;
		int remainder;
		int temp = number;
		
		while(number != 0)
		{
			remainder = number % 10;
			sum = sum * 10 + remainder;
			number = number / 10;
		}
		
		if(temp == sum)
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
}

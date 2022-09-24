import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int x = sc.nextInt();
		System.out.print("City associated : ");
		
		switch(x)
		{
			case 1:
				System.out.println("Pune");
				break;
			case 2:
				System.out.println("Nashik");
				break;
			case 3:
				System.out.println("Nagpur");
				break;
			case 4:
				System.out.println("Latur");
				break;
			default:
				System.out.println("Wrong option");
		}	
	}
}

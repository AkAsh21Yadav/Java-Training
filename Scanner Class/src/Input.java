import java.util.*;
public class Input 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter No. : ");
		s.nextInt();
		System.out.print("Enter float : ");
		s.nextFloat();
		System.out.print("Enter String : ");
		s.next();
		System.out.print("Enter Double : ");
		s.nextDouble();
		System.out.print("Enter Short : ");
		s.nextShort();
		System.out.print("Enter Boolean : ");
		s.nextBoolean();
		System.out.print("Enter Line : ");
		s.nextLine();
	}
}

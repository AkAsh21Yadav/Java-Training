
public class Swap 
{
	public static void main(String[] args) 
	{
		int a = 21;
		int b = 45;
		
		System.out.println("a : "+a+"\nb : "+b);
		
		a = a - b;
		b = a + b;
		a = b - a;
		
		System.out.println("\na : "+a+"\nb : "+b);
		
		int t = a;
		a = b;
		b = t;
		
		System.out.println("\na : "+a+"\nb : "+b);
	}
}

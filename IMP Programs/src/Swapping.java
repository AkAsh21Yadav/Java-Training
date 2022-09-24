
public class Swapping 
{
	public static void main(String[] args) 
	{
		int a = 21;
		int b = 51;
		System.out.println("Before Swapping = " + "a:"+a+"  b:"+b);
		a = a-b;
		b = a+b;	//Swapping using 2 variables
		a = b-a;
		System.out.println("After swapping = " + "a:"+a+"  b:"+b);
		
		
		int x = 100;
		int y = 200;
		int t;
		System.out.println("\nBefore swapping = " + "x:"+x+"  y:"+y);
		t = x;
		x = y;	//Swapping using 3rd temporary variable
		y = t;
		System.out.println("After swapping = " + "x:"+x+"  y:"+y);	
	}
}

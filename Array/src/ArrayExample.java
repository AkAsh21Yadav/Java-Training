import java.util.Arrays;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		char[] c = new char[4];
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		c[3] = 'D';
		System.out.println("Size of 1st Array : "+c.length);
		System.out.print("Elements of 1st Array : ");
		System.out.println(Arrays.toString(c));
		
		double[] d = {1.1,2.2,3.3,4.4,5.5 };
		System.out.println("\nSize of 2nd Array : "+d.length);
		System.out.print("Elements of 2nd Array : ");
		System.out.println(Arrays.toString(d));
	}
}

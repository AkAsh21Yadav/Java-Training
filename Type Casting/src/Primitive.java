
public class Primitive 
{
	public static void main(String[] args) 
	{
		byte b = 111;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println("Widening : "+d);
		
		double d1 = 151.0;
		float f1 = (float) d1;
		long l1 = (long) f1;
		int i1 = (int) l1;
		short s1 = (short) i1;
		byte b1 = (byte) s1;
		System.out.println("Narrowing : "+b1);
		
		
	}
}

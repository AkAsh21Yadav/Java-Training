
public class TypeCasting 
{
	public static void main(String[] args) 
	{
		byte a = 121;
		short b = a;
		int c = b;
		long d = c;
		float e = d;
		double f = e;
		System.out.println(f);
		
		double p = 1255;
		float q = (float) p;
		long r = (long) q;	
		int s = (int) r;	//Data Loss
		short t = (short) s;
		byte u = (byte) t;
		System.out.println(u);	
	}
}

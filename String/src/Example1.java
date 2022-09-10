
public class Example1 
{
	public static void main(String[] args) 
	{
		int a = 21;
		String s1 = a + "";
		System.out.println(s1);
		
		String s2 = String.valueOf(a);
		System.out.println(s2);
		
		Integer b = a;
		String s3 = b.toString();
		System.out.println(s3);
		
		int x = Integer.parseInt(s3);
		System.out.println(x);
	}
}


public class StringCompare1 
{
	public static void main(String[] args) 
	{
		int a = 21;
		String s1 = a+"";
		System.out.println("String1 : "+s1);
		
		String s2 = String.valueOf(a);
		System.out.println("String2 : "+s2);
		
		Integer j = a;
		String s3 = j.toString();
		System.out.println("String3 : "+s3);
		
		int p = Integer.parseInt(s3);
		System.out.println("Integer : "+p);
		
		String x = "Pune is in the Maharashtra";
		int count = x.length();
		
		System.out.print("\nReverse String : ");
		while(count!=0)
		{
			System.out.print(x.charAt(count-1));
			count--;
		}
	}
}

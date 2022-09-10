
public class StringConversion
{
	public static void main(String[] args) 
	{
		int x = 10;
			String s1 = x + " "; 	//	integer to String
			System.out.println(s1);
			
			String s2 = String.valueOf(x);
			System.out.println(s2);
			
			Integer i = x;
			String s3 = i.toString();
			System.out.println(s3);
			
			String s4 = "21";	// String to Integer
			int a = Integer.parseInt(s4);
			System.out.println(a);
			
			String s5 = "21.21";
			double d = Double.parseDouble(s5);
			System.out.println(d);
	}
}

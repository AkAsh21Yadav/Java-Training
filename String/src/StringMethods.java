
public class StringMethods 
{
	public static void main(String[] args) 
	{
		String a = "   AkAsh Yadav   ";
		String b = "Akash";
		
		System.out.println(a.charAt(7));
		System.out.println(a.endsWith("s"));
		System.out.println(a.startsWith("A"));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.isEmpty());
		System.out.println(a.length());
		System.out.println(a.replace("h","H"));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.trim());
		System.out.println(a.substring(6));
		System.out.println(a.substring(2,9));
		System.out.println(a.indexOf("Y"));
				
	}
}

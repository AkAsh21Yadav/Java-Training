
public class StringCompare 
{
	public static void main(String[] args) 
	{
		String a = "Akash";
		String b = "AkAsh";
		
		if(a == b)  //It compares ADDRESS of the 2 strings.
		{
			System.out.println("Both strings matched.");
		}
		else
		{
			System.out.println("Both strings are not matched.");
		}
		
		if(a.equalsIgnoreCase(b)) //It compares the content of 2 string (Case Insensitive).
		{
			System.out.println("Both the strings are same.");
		}
		else
		{
			System.out.println("Both the strings are not same.");
		}
		
		if (a.equals(b)) //It compares the content of 2 string (Case Sensitive).
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not matching");
		}
		
		System.out.println(a.compareTo(b));//The comparison is based on the Unicode value of each character in the strings.
		
	}
}


public class StringReverse 
{
	public static void main(String[] args) 
	{
		String name = "Akash Yadav";
		int count = name.length();
		
		while(count!=0)
		{
			System.out.print(name.charAt(count-1));
			count--;
		}
	}
}


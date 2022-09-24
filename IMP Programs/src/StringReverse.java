
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String name = "Tom Adams";
		int count = name.length();
		System.out.println("Size : "+count);
		
		while(count!=0)
		{
			System.out.print(name.charAt(count-1));
			count--;
		}
	}
}


public class Length 
{
	public static void main(String[] args) 
	{
		String name = "AkAsh";
		int i = 0;
		char[] ch = name.toCharArray();
		for (char c : ch) 
		{	
			i++;
		}
		
		System.out.println("Length : "+i);
		
		System.out.print("Reverse String : ");
		while(i!=0)
		{
			System.out.print(name.charAt(i-1));
			i--;
		}
	}
}

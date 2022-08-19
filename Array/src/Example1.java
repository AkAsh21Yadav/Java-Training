import java.util.Arrays;

public class Example1 
{
	public static void main(String[] args) 
	{
		String[] names = new String[3];
		names[0] = "Akash";
		names[1] = "Ak";
		names[2] = "Aka";
		
		System.out.println(Arrays.toString(names));
		System.out.println(names.length);
		
		
		String[] name = {"Ak","Bk"};
		System.out.println("\n"+name.length);
		
		for (String i : name) 
		{
			System.out.println(i);
		}
	}
}

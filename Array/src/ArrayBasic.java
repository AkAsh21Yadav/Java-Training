import java.util.Arrays;

public class ArrayBasic 
{
	public static void main(String[] args) 
	{
		String[] names = new String[3];
		names[0] = "Virat";
		names[1] = "Rohit";
		names[2] = "Mithali";
		System.out.println("Size of First Array : " +names.length);
		System.out.println("Elements of 1st Array : ");		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);	
		System.out.println("Elements of 1st Array : " +Arrays.toString(names));	
		
		int[] nums = {12,20,30,40};
		System.out.println("\nSize of Second Array : " +nums.length);
		System.out.println("Elements of 2nd Array : ");
		
		for (int i : nums) 
		{
			System.out.println(i);
		}
		
		System.out.println("Elements of 2nd Array : " +Arrays.toString(nums));
	}
}
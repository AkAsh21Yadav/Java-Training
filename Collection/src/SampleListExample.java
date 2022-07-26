import java.util.*;

public class SampleListExample 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
		System.out.println("ArrayList : "+a);
		
		LinkedList<Integer> b = new LinkedList<>(a);
		System.out.println("LinkedList : "+b);
		
		Vector<Integer> c = new Vector<>(b);
		System.out.println("Vector : "+c);
		
	}
}

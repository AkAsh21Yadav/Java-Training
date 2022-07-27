import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,Character> result = new LinkedHashMap<>();
		result.put(1,'A');
		result.put(2,'B');
		result.put(3,'C');
		result.put(4,'D');
		result.put(5,'E');
		
		System.out.println("Elements : "+result);
		System.out.println("Contains key : "+result.containsKey(3));
		System.out.println("Contains value : "+result.containsValue('D'));
		System.out.println("Is empty : "+result.isEmpty());
		System.out.println("Size : "+result.size());
		System.out.println("Get value  : "+result.get(5));
		System.out.println("Removed element : "+result.remove(4));
		System.out.println("Elements after removal : "+result);
		
		result.put(1,'F');
		System.out.println("Replacement after insertion : "+result);
		
		HashMap h = new HashMap(result);
		System.out.println("\nHashMap elements : "+h);
	}
}

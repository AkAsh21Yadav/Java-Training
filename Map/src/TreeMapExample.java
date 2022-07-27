import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> data = new TreeMap<>();
		data.put(101,"Akash");
		data.put(103,"Mark");
		data.put(102,"Raj");
		data.put(104,"Alpha");
		
		System.out.println("Elements : "+data);
		System.out.println("Get element : "+data.get(103));
		System.out.println("Is Empty : "+data.isEmpty());
		System.out.println("Removed element : " +data.remove(102));
		System.out.println("Elements : "+data);
		System.out.println("Size after removal : "+data.size());
		
		data.put(101,"AKASH");
		System.out.println("Elements after insertion : "+data);
		
		HashMap h = new HashMap(data);
		System.out.println("\nHashMap elements : "+h);
	}
}

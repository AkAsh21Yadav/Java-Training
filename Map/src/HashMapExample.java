import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapExample 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> student = new HashMap<>();
		student.put(1,"AkAsh");
		student.put(2,"Raj");
		student.put(3,"Mark");
		student.put(4,"Tyler");
		student.put(5,"Mahi");
		
		System.out.println("Elements : "+student);
		System.out.println("Get element : "+student.get(1));
		System.out.println("Is empty : "+student.isEmpty());
		System.out.println("Remove : "+student.remove(4));
		System.out.println("After removal : "+student);
		System.out.println("Size : " +student.size());
		
		student.put(3,"Vishwa");
		System.out.println("Replacement after insertion : "+student);	
		
		LinkedHashMap h = new LinkedHashMap(student);
		System.out.println("\nLinkedHashMap : "+h);	
		
		System.out.println("\nPrinting only keys : ");
		h.forEach((k,v) -> System.out.println(k));

		System.out.println("\nPrinting only values : ");
		h.forEach((k,v) -> System.out.println(v));
	}
}

import java.util.ArrayList;

public class SampleCollectionExample 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();	//Heterogenous
		a.add(21);
		a.add("AkAsh");
		a.add('A');
		a.add(true);
		a.add(null);
		a.add(21.21);
		
		System.out.println("Initial Size : "+a.size());
		System.out.println("Elements : "+a);
		System.out.println("isEmpty : "+a.isEmpty());
		System.out.println("Removing Element : "+a.remove(4));
		System.out.println("After removing : "+a);
		System.out.println("Size after removing : "+a.size());
		System.out.println("Contains : "+a.contains("AkAsh"));
		a.clear();
		System.out.println("Elements after clearing : "+a);
		System.out.println("Size after clearing : "+a.size());		
		
		
	}
}

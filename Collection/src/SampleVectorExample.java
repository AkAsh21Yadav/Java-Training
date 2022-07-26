import java.util.Arrays;
import java.util.Vector;

public class SampleVectorExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Vector Heterogenous class : ");
		Vector v = new Vector(Arrays.asList("AkAsh",21,11.11,true,null,null));
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.contains(null));
		System.out.println(v.remove(2));
		System.out.println(v);
		
		System.out.println("\nVector Homogenous/Generic class : ");
		Vector<Integer> w = new Vector<>(Arrays.asList(1,2,3,4,2,1));
		System.out.println(w);
		System.out.println(w.size());
		System.out.println(w.isEmpty());
		System.out.println(w.get(0));
		System.out.println(w.remove(2));
		System.out.println(w);
		System.out.println(w.set(2,44));
		System.out.println(w);
		w.clear();
		System.out.println(w);

	}
}

import java.util.Stack;

public class SampleStack 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		
		s.add(21);
		s.add("AkAsh");
		s.add(true);
		s.add(null);
		s.add(11.11);
		s.add(true);
		
		System.out.println("Elements : " +s);
		System.out.println("Size : " +s.size());
		System.out.println("First Element : " +s.firstElement());
		System.out.println("Last Element : " +s.lastElement());
		System.out.println("Elements at given index : " +s.get(3));
		System.out.println("is Empty : " +s.isEmpty());
		System.out.println("Removed Element : " +s.remove(5));
		System.out.println("Elements after removal : " +s);
		System.out.println("Size after removal : " +s.size());
	}

}

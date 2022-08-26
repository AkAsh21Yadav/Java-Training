import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		ArrayList rank = new ArrayList<>();
		rank.add(1);
		rank.add(2);
		rank.add(3);
		
		System.out.println(rank);
		System.out.println(rank.contains(1));
		System.out.println(rank.get(2));
		System.out.println(rank.hashCode());
		System.out.println(rank.indexOf(3));
		System.out.println(rank.isEmpty());
		System.out.println(rank.remove(0));
		System.out.println(rank.set(1,21));
		System.out.println(rank.size());
		System.out.println(rank);
		
		ArrayList<Integer> order = new ArrayList<>(Arrays.asList(11,22,23,24,25));
		
		System.out.println("\n"+order);
		System.out.println("\n"+order.addAll(rank));
		System.out.println(rank);
		System.out.println(order);
		System.out.println("\n"+order.containsAll(rank));
		System.out.println(rank);
		System.out.println(order);
		System.out.println("\n"+order.retainAll(rank));
		System.out.println(rank);
		System.out.println(order);
		System.out.println("\n"+order.removeAll(rank));
		System.out.println(rank);
		System.out.println(order);
	}
}

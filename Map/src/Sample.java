import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Sample 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> studentsMap = new HashMap<>();
		studentsMap.put(55, "Delta");
		studentsMap.put(45, "MK");
		studentsMap.put(78, "Tyler");
		studentsMap.put(1, "Alpha");
		System.out.println(studentsMap);

		studentsMap.forEach((k, v) -> System.out.println(k));

		ArrayList list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		list.forEach((o) -> System.out.println(o));
	}
}



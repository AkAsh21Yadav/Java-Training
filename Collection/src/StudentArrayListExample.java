import java.util.ArrayList;
import java.util.Arrays;

public class StudentArrayListExample 
{
	int id,age;
	String name;
	
	public StudentArrayListExample(int id,String name,int age) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "StudentArrayListExample [id=" + id + ","+ "name=" + name + ","+ "age=" + age + "]";
	}
	
	public static void main(String[] args) 
	{
		
		StudentArrayListExample s1 = new StudentArrayListExample(1,"AkAsh",21);
		StudentArrayListExample s2 = new StudentArrayListExample(2,"Mahi",22);
		StudentArrayListExample s3 = new StudentArrayListExample(3,"Raj",23);
		
		ArrayList a = new ArrayList(Arrays.asList(s1,s2,s3));
		
		System.out.println(a);
		System.out.println("\n" +a.get(0));
		
		System.out.println("\nFor each loop : ");
		for (Object o : a) 
		{
			System.out.println(o);
		}
	}
}

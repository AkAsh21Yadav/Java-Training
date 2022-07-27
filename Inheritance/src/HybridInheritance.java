
class College
{
	void name()
	{
		System.out.println("DSCL");
	}
}

class Subject extends College
{
	void name()
	{
		System.out.println("Mathematics");
	}
}

class Faculty extends Subject
{
	void name()
	{
		System.out.println("Patil");
	}
}

class Department extends Subject
{
	void name()
	{
		System.out.println("Chemistry");
	}
}

public class HybridInheritance extends Subject
{
	void name()
	{
		System.out.println("Topper");
	}
	
	public static void main(String[] args) 
	{
		HybridInheritance h = new HybridInheritance();
		h.name();
	}
}

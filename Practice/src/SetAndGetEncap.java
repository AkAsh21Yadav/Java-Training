
class Encap
{
	private int id;
	private String name;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	Encap()
	{
		super();
		System.out.println("Default constructor");
	}
}

public class SetAndGetEncap 
{
	static
	{
		System.out.println("This is static block");
	}
	
//	{
//		System.out.println("This is non-static block");
//	}
	
	private SetAndGetEncap()
	{
		System.out.println("Private constructor");
	}
	
	public static void main(String[] args) 
	{
		Encap e = new Encap();
		e.setId(21);
		e.setName("AkAsh");
		System.out.println("Id : "+e.getId()+"\nName : "+e.getName());
		
		//new SetAndGetEncap();
	}
}

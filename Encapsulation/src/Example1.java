
public class Example1 
{
	private String name;
	private int id;
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public static void main(String[] args) 
	{
		Example1 e = new Example1();
		e.setId(1);
		e.setName("AkAsh");
		System.out.println("ID = "+e.getId()+"\nName = "+e.getName());
	}
}

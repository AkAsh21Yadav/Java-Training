
class capsul
{
	private int id;	//Declaration
	private String name;
	
	public capsul(int id,String name)  //Initialization
	{
		this.id = id;
		this.name = name;
	}
	
	public void display()  //Utilization
	{
		System.out.println("Id : "+id+"\nName : "+name);
	}
}

public class Encapsulation 
{
	public static void main(String[] args) 
	{

		capsul c = new capsul(21,"AkAsh");
		c.display();
	}
}

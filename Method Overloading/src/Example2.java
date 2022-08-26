
public class Example2 
{
	String name;
	double salary;
	
	Example2()
	{
		this(21);	//constructor chaining in same class
		System.out.println("This is default constructor");
	}
	
	Example2(String name)
	{
		System.out.println("Name : " +name);
	}
	
	Example2(int id)	//constructor overloading
	{
		this("AkAsh");
		System.out.println("ID : "+id);
	}
	void department(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
		System.out.println("\nName : "+name+"\nSalary : "+salary);
	}
	
	void department(double salary,String name)	//Method overloading
	{
		this.name = name;
		this.salary = salary;
		System.out.println("\nSalary : "+salary+"\nName : "+name);
	}
	
	public static void main(String[] args) 
	{
		Example2 e = new Example2();
		e.department("Rohit",52415.32);
		e.department(95472,"Mahi");
	}
	
}

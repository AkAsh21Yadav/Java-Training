
public class Student 
{
	int id;
	String name;
	Address address;
	
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.id = 21;
		s.name = "AkAsh";
		
		s.address = new Address();
		s.address.houseNo = 101;
		s.address.street = "Ram Nagar";
		s.address.city = "Pune";
		s.address.pinCode = 400008;
		
		System.out.println(s);
	}
}

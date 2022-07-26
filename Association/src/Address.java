
public class Address 
{
	int houseNo;
	String street;
	String city;
	int pinCode;
	
	@Override
	public String toString() 
	{
		return "Address [houseNo=" + houseNo + ", street=" + street + ","
				+ " city=" + city + ", pinCode=" + pinCode + "]";
	}
}

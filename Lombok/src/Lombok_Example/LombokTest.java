package Lombok_Example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
class Test
{
	private int id;
	private String name;
	private String org;
	
//	public Test(int id, String name, String org) 
//	{
//		this.id = id;
//		this.name = name;
//		this.org = org;
//	}
//	
//	public int getId()
//	{
//		return id;
//	}
//	
//	public void setId(int id)
//	{
//		this.id = id;
//	}
//	public String getName() 
//	{
//		return name;
//	}
//	public void setName(String name) 
//	{
//		this.name = name;
//	}
//	public String getOrg() 
//	{
//		return org;
//	}
//	public void setOrg(String org) 
//	{
//		this.org = org;
//	}
//
//	@Override
//	public String toString() 
//	{
//		return "LombokTest [id=" + id + ", name=" + name + ", org=" + org + "]";
//	}	
}
public class LombokTest 
{
	public static void main(String[] args) 
	{
		Test t = new Test(21,"AkAsh","Wipro");
		System.out.println("Employee Name : "+t.getName());
		t.setOrg("TATA");
		System.out.println("Organizatin Name : "+t.getOrg());
	}
}

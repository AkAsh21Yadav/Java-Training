class Info
{
	private String name,year,branch;
	private int rollNo,age;
	
	public Info(String name, String year, String branch, int rollNo, int age) 
	{
		this.name = name;
		this.year = year;
		this.branch = branch;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	void display()
	{
		System.out.println("\nRollNo: "+rollNo+"\nName: "+name+"\nBranch: "+branch+"\nAge: "+age+"\nYear: "+year);
	}		
}

public class Student 
{
	public static void main(String[] args) 
	{
		Info i1 = new Info("AkAsh","First Year","IT",1,22);
		Info i2 = new Info("Rohit","Second Year","CSE",2,21);
		Info i3 = new Info("Virat","Third Year","MECH",3,23);
	
		i1.display();
		i2.display();
		i3.display();
	}
}

package Lombok_Example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Exam
{
	private int id;
	private String name;
	private int std;
	private String sub;

//	public Exam(int id, String name, int std, String sub)
//	{
//		this.id = id;
//		this.name = name;
//		this.std = std;
//		this.sub = sub;
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
//
//	public String getName() 
//	{
//		return name;
//	}
//
//	public void setName(String name)
//	{
//		this.name = name;
//	}
//
//	public int getStd() 
//	{
//		return std;
//	}
//
//	public void setStd(int std) 
//	{
//		this.std = std;
//	}
//
//	public String getSub()
//	{
//		return sub;
//	}
//
//	public void setSub(String sub) 
//	{
//		this.sub = sub;
//	}
//
//	@Override
//	public String toString() 
//	{
//		return "Exam [id=" + id + ", name=" + name + ", std=" + std + ", sub=" + sub + "]";
//	}
}


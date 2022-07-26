class Area
{
	int Length,Breadth;

	Area(int Length,int Breadth)		
	{
		this.Length = Length;
		this.Breadth = Breadth;
	}

	void getArea()
	{
		int Area = Length * Breadth;
		System.out.println("Area : "+Area);
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		Area a = new Area(10,10);
		a.getArea();
	}
}

/*  In this example, we have created a class named Area. 
The main purpose of this class is to calculate the area.
To calculate an area, we need two variables: length and breadth 
and 
a method: getArea(). 
Hence, we bundled these fields and methods inside a single class. */
package practiceFile;

import java.io.File;

public class Methods 
{
	public static void main(String[] args) 
	{
			File obj = new File("FileHandling.txt");
			if(obj.exists())
			{
				System.out.println("Name : "+obj.getName());
				System.out.println("Path : "+obj.getPath());
				System.out.println("Absolute Path : "+obj.getAbsolutePath());
				System.out.println("CanRead : "+obj.canRead());
			}
	}
}

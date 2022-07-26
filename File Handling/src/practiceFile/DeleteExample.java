package practiceFile;

import java.io.File;

public class DeleteExample 
{
	public static void main(String[] args) 
	{
		File obj = new File("FileHandling.txt");
		
		if(obj.exists())
		{
			obj.delete();
		}
		else
		{
			System.out.println("File does not exists");
		}
	}
}

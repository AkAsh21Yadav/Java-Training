package practiceFile;

import java.io.File;
import java.io.IOException;

public class CreateExample 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
			File obj = new File("FileHandling.txt");
		
			if(obj.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is already existed");
			}
		}
		catch(IOException e)
		{
			System.out.println("Error occurred");
			e.printStackTrace();
		}
	}

}

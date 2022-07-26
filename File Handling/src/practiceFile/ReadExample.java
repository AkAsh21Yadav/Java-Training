package practiceFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadExample 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File obj = new File("FileHandling.txt");
		try
		{
			Scanner Reader = new Scanner(obj);		
			if(obj.exists())
			{
				while(Reader.hasNextLine())
				{
					String data = Reader.nextLine();
					System.out.println(data);
				}
			}
			else
			{
				System.out.println("File does not exists");
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

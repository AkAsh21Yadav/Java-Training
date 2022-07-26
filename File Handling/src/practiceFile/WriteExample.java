package practiceFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{	
			File obj = new File("FileHandling.txt");
			if(obj.exists())
			{
				FileWriter w = new FileWriter(obj);
				w.write("My name is AkASh Yadav.I am looking for job as Fresher.");
				w.close();
				System.out.println("Successfully Written");
			}
			else
			{
				System.out.println("File does not exist");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

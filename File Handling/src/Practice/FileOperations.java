package Practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations 
{
	public static void main(String[] args) throws IOException 
	{
		File obj = new File("File.txt");	
		
		if(obj.createNewFile())	//Create new file
		{
			System.out.println("File is created successfully");
		}
		else
		{
			System.out.println("File is already existed");
		}
		
		if(obj.exists())
		{
			FileWriter w = new FileWriter(obj);	//Write into new file
			w.write("India is present in South Asia");
			w.close();
			System.out.println("Written sucessfully");
			
			Scanner reader = new Scanner(obj);	//Read new file
				while(reader.hasNextLine())
					{
						String data = reader.nextLine();
						System.out.println(data);
					}
			
			obj.delete();	//Delete file
			System.out.println("File deleted successfully");
		}
		
		else
		{
			System.out.println("File does not exists");
		}
	}
}

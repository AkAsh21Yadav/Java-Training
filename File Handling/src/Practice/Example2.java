package Practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example2 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("./file/notes.txt");
//		if(file.createNewFile())
//		{
//			System.out.println("File is created");
//		}
//		else
//		{
//			System.out.println("File already existed");
//		}
//			
//		FileWriter f = new FileWriter("./file/notes.txt");
//		f.write("Java is very Interesting language");
//		f.close();
//		
//		Scanner reader = new Scanner(file);
//		while(reader.hasNextLine())
//		{
//			String text = reader.nextLine();
//			System.out.println("Content : "+text);
//		}
//		
		if (file.exists())
		{
			System.out.println("File deleted successfully : "+file.delete());
		}
		else
		{
			System.out.println("file does not exist");
		}
		
	}
}

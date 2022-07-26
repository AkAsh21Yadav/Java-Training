import java.io.File;

public class Delete 
{
	public static void main(String[] args) 
	{
		
			File obj = new File("Notes.txt");
			if(obj.delete())
			{
				System.out.println("File Deleted");
			}
			else
			{
				System.out.println("Failed to delete file");
			}
	}
}

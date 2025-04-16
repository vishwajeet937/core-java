import java.io.FileReader;
import java.io.IOException;

public class CheckedException
{
	CheckedException()throws IOException,Exception
	{
	    FileReader file = new FileReader("myfile.txt");
		System.out.println();
	}
	public void add()
	{
		System.out.println("add:");
	}
	public static void main(String[] args)
	{
		try {
			CheckedException ce=new CheckedException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//try 
		//{
		 //   FileReader file = new FileReader("myfile.txt");
		    // Perform file operations
		//}
		//catch (IOException e) 
		//{
		    // Handle the exception, e.g., by logging or reporting
		//}
	}

}
